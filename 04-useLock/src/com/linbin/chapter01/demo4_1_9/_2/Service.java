package com.linbin.chapter01.demo4_1_9._2;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @ClassName Service
 * @Author LinBin
 * @Date 2019/12/11 13:39
 * @Description :
 */
public class Service {
    private Lock lock;
    private boolean isFair;
    public Service(boolean isFair){
        this.isFair = isFair;
        lock = new ReentrantLock(isFair);
    }

    public void method(){
        try {
            lock.lock();
            System.out.println("ThreadName = " + Thread.currentThread().getName() + " 获得锁定");
        }finally {
            lock.unlock();
        }
    }
}
