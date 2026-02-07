package com.shea.mall.api.example.decorator;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author : Shea.
 * @description: 记录InputStream调用了多少次read
 * @since : 2026/2/5 15:00
 */
public class InputStreamCount extends InputStream {

    private int count = 0;
    InputStream in;

    public InputStreamCount(InputStream in) {
        this.in = in;
    }

    public int getCount() {
        return count;
    }

    public int read() throws IOException {
        count++;
        return in.read();
    }

    public int read(byte[] b) throws IOException {
        count++;
        return in.read(b);
    }

    public int read(byte[] b, int off, int len) throws IOException {
        count++;
        return in.read(b, off, len);
    }
}
