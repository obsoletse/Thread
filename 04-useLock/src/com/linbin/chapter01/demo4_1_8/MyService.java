package com.linbin.chapter01.demo4_1_8;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @ClassName MyService
 * @Author LinBin
 * @Date 2019/12/10 15:01
 * @Description :
 */
public class MyService {
    private Lock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();
    private boolean hasValue = false;

    public void product(){
        try {
            lock.lock();
            if (hasValue == true){
                System.out.println(Thread.currentThread().getName() + "在等待");
                condition.await();
            }
            System.out.println(Thread.currentThread().getName() +"生产了*");
            hasValue = true;
            Thread.sleep(1000);
            condition.signal();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }

    public void consumption(){
        try {
            lock.lock();
            if (hasValue == false){
                System.out.println(Thread.currentThread().getName() + "在等待");
                condition.await();
            }
            System.out.println(Thread.currentThread().getName() +"消费了*");
            hasValue = false;
            Thread.sleep(1000);
            condition.signal();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }
}
