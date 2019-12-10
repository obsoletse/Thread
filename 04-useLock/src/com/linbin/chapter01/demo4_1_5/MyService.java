package com.linbin.chapter01.demo4_1_5;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @ClassName MyService
 * @Author LinBin
 * @Date 2019/12/10 14:30
 * @Description :
 */
public class MyService {
    private Lock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();

    public void await(){
        try{
            lock.lock();
            System.out.println("Thread " + Thread.currentThread().getName() + " await begin time = " + System.currentTimeMillis());
            condition.await();
            System.out.println("Thread " + Thread.currentThread().getName() + " await end time = " + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }

    public void signalAll(){
        lock.lock();
        condition.signalAll();
        lock.unlock();
    }
}
