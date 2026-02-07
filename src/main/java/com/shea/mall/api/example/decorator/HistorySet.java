package com.shea.mall.api.example.decorator;

import java.util.*;

/**
 * @author : Shea.
 * @description: TODO
 * @since : 2026/2/5 10:57
 */
public class HistorySet<X> implements Set<X> {

    List<X> removeList = new ArrayList<X>();

    private final Set<X> set;

    public HistorySet(Set<X> set) {
        this.set = set;
    }

    @Override
    public int size() {
        return set.size();
    }

    @Override
    public boolean isEmpty() {
        return set.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return set.contains(o);
    }

    @Override
    public Iterator<X> iterator() {
        return set.iterator();
    }

    @Override
    public Object[] toArray() {
        return set.toArray();
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return set.toArray(a);
    }

    @Override
    public boolean add(X x) {
        return set.add(x);
    }

    @Override
    public boolean remove(Object o) {
        if(set.remove(o)){
            removeList.add((X)o);
            return true;
        }
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return set.containsAll(c);
    }

    @Override
    public boolean addAll(Collection<? extends X> c) {
        return set.addAll(c);
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return set.retainAll(c);
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return set.removeAll(c);
    }

    @Override
    public void clear() {

    }

    @Override
    public String toString() {
        return set.toString() + " remove list: " + removeList.toString();
    }
}
