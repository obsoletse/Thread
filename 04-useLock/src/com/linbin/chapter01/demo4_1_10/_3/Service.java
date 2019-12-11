package com.linbin.chapter01.demo4_1_10._3;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @ClassName Service
 * @Author LinBin
 * @Date 2019/12/11 14:26
 * @Description :
 */
public class Service {
    private ReentrantLock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();
    public void waitMethod(){
        try {
            lock.lock();
            condition.await(Integer.MAX_VALUE, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void notifyMethod(){
        try {
            lock.lock();
            System.out.println("唤醒前有" + lock.getWaitQueueLength(condition) + "在等待");
            condition.signal();
            System.out.println("唤醒后有" + lock.getWaitQueueLength(condition) + "在等待");
        }finally {
            lock.unlock();
        }
    }
}
