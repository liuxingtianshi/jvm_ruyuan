package com.ruyuan.jvm;

import java.util.ArrayList;

/**
 * 测试堆OOM
 * -Xms10m -Xmx10m
 */
public class HeapOOM {
    public static void main(String[] args) {
        ArrayList<Object> objects = new ArrayList<>();
        long counter = 0;
        while (true) {
            System.out.println("添加第" + (++counter) + "个对象");
            objects.add(new Object());
        }
    }
}
