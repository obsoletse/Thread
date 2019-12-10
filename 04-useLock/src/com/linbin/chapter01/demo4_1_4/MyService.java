package com.linbin.chapter01.demo4_1_4;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @ClassName MyService
 * @Author LinBin
 * @Date 2019/12/10 13:25
 * @Description :
 */
public class MyService {
    private Lock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();

    public void await(){
        try {
            lock.lock();
            System.out.println("await 的时间是: " + System.currentTimeMillis());
            condition.await(2,TimeUnit.SECONDS);
            Thread.sleep(2000);
            System.out.println("end time = " + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }

    public void signal(){
        try {
            lock.lock();
            System.out.println("signal 的时间是: " + System.currentTimeMillis());
            condition.signal();
        } finally {
            lock.unlock();
        }
    }
}
