package com.shea.mall.api.example.flyweight;

import java.nio.ByteBuffer;
import java.time.Instant;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author : Shea.
 * @description: TODO
 * @since : 2026/2/6 15:05
 */
public class BufferPool {

    private final int totalSize;
    private final int slotSize;
    private int free;
    private final Deque<ByteBuffer> slotQueue = new ArrayDeque<>();
    private final Lock lock = new ReentrantLock();
    private final Deque<Condition> waiters = new ArrayDeque<>();

    public BufferPool(int totalSize, int slotSize) {
        this.totalSize = totalSize;
        this.slotSize = slotSize;
        this.free = totalSize;
    }

    public ByteBuffer allocate(int size,long timeout) throws InterruptedException {
        if (size <= 0 || size > totalSize) {
            throw new RuntimeException("Invalid size " + size);
        }
        lock.lock();
        try {
            if (size == slotSize && !slotQueue.isEmpty()) {
                return slotQueue.pollFirst();
            }
            if ((free + slotQueue.size() * slotSize) >= size) {
                freeUp(size);
                free -= size;
                return ByteBuffer.allocate(size);
            }
            Condition condition = lock.newCondition();
            waiters.addLast(condition);
            long remainTime = timeout;
            try {
                while (true) {
                    long start = Instant.now().toEpochMilli();
                    boolean wakeup = condition.await(remainTime, TimeUnit.MILLISECONDS);
                    if (!wakeup) {
                        throw new RuntimeException("Timeout waiting for " + remainTime + " milliseconds");
                    }
                    if (size == slotSize && !slotQueue.isEmpty()) {
                        return slotQueue.pollFirst();
                    }
                    if ((free + slotQueue.size() * slotSize) >= size) {
                        freeUp(size);
                        free -= size;
                        return ByteBuffer.allocate(size);
                    }
                    remainTime -= System.currentTimeMillis() - start;
                }
            } finally {
                waiters.remove(condition);
            }
        } finally {
            if(!waiters.isEmpty() && !(free == 0 && slotQueue.isEmpty())) {
                waiters.peek() .signal();
            }
            lock.unlock();
        }
    }

    private void freeUp(int size) {
        while (free < size && !slotQueue.isEmpty()) {
            free += slotQueue.pollFirst().capacity();
        }
    }

    public void deallocate(ByteBuffer buffer) {
        lock.lock();
        try {
            if(buffer.capacity() == this.slotSize){
                this.slotQueue.add(buffer);
            }else{
                free += buffer.capacity();
            }
            if(!waiters.isEmpty()){
                waiters.peek().signal();
            }
        }finally {
            lock.unlock();
        }
    }
}
