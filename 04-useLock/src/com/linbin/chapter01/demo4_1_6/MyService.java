package com.linbin.chapter01.demo4_1_6;

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
    private Condition condition1 = lock.newCondition();
    private Condition condition2 = lock.newCondition();

    public void await1(){
        try{
            lock.lock();
            System.out.println("Thread " + Thread.currentThread().getName() + " await1 begin time = " + System.currentTimeMillis());
            condition1.await();
            System.out.println("Thread " + Thread.currentThread().getName() + " await1 end time = " + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }

    public void await2(){
        try{
            lock.lock();
            System.out.println("Thread " + Thread.currentThread().getName() + " await2 begin time = " + System.currentTimeMillis());
            condition2.await();
            System.out.println("Thread " + Thread.currentThread().getName() + " await2 end time = " + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }

    public void signal1(){
        lock.lock();
        condition1.signal();
        lock.unlock();
    }
}
