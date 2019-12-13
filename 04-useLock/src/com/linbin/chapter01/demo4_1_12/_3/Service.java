package com.linbin.chapter01.demo4_1_12._3;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @ClassName Service
 * @Author LinBin
 * @Date 2019/12/13 9:33
 * @Description :
 */
public class Service {
    private ReentrantLock lock = new ReentrantLock();
    public void method() throws InterruptedException {
        lock.lock();
       Thread.sleep(Integer.MAX_VALUE);
        lock.unlock();
    }

    public void isLock(){
        System.out.println(lock.isLocked());
    }
}
