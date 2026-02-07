package com.shea.mall.api.example.decorator;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Instant;

/**
 * @author : Shea.
 * @description: TODO
 * @since : 2026/2/5 11:00
 */
public class Main {

    public static void main(String[] args) throws IOException {
        byte[] buffer = new byte[8192];
        BufferedInputStream fis = new BufferedInputStream(new FileInputStream("C:\\Users\\xgw\\Desktop\\shea\\全国大学生职业规划大赛生涯发展展示.pptx"));
        InputStreamCount count = new InputStreamCount(fis);
        long start = Instant.now().toEpochMilli();
        while(count.read(buffer) != -1) {

        }
        System.out.println("用时:" + (Instant.now().toEpochMilli() - start) + "ms");
        System.out.println(count.getCount());
    }
}
