package com.linbin.chapter01.demo4_1_2;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @ClassName MyService
 * @Author LinBin
 * @Date 2019/12/10 10:14
 * @Description :
 */
public class MyService {
    private Lock lock = new ReentrantLock();
    public void methodA(){
        try{
            lock.lock();
            System.out.println("Thread name = " + Thread.currentThread().getName() + " start methodA  = " + System.currentTimeMillis());
            Thread.sleep(3000);
            System.out.println("Thread name = " + Thread.currentThread().getName() + " end methodA = " + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }

    public void methodB(){
        try{
            lock.lock();
            System.out.println("Thread name = " + Thread.currentThread().getName() + " start methodB  = " + System.currentTimeMillis());
            Thread.sleep(3000);
            System.out.println("Thread name = " + Thread.currentThread().getName() + " end methodB = " + System.currentTimeMillis());

        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }
}
