package com.heidsoft.thread.test;

import com.heidsoft.thread.extthread.MyServiceThread;

/**
 * 测试 锁 可重入
 */
public class MyServiceRun {
    public static void main(String[] args) {
        MyServiceThread myServiceThread = new MyServiceThread();
        myServiceThread.start();
    }
}
