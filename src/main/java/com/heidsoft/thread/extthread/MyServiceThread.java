package com.heidsoft.thread.extthread;

import com.heidsoft.thread.myservice.Service;

/**
 * 测试 锁 可重入
 */
public class MyServiceThread extends Thread{

    @Override
    public void run() {
        super.run();
        Service service = new Service();
        service.service1();
    }
}
