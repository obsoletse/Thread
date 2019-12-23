package com.linbin.chapter01.demo4_1_13._1;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @ClassName Service
 * @Author linBin
 * @Date 2019/12/23 11:01
 * @Description ：
 */
public class Service {
    private ReentrantLock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();

    public void waitMethod(){
        try {
            lock.lockInterruptibly();
            System.out.println("lock begin time = " + System.currentTimeMillis() + " Thread = " + Thread.currentThread().getName());
            for (int i = 0 ; i < Integer.MAX_VALUE / 10; i ++ ){
                String newString = new String();
                Math.random();
            }
            System.out.println("lock end time = " + System.currentTimeMillis() + " Thread = " + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            System.out.println("抛出中断异常!");
        } finally {
            if (lock.isHeldByCurrentThread()){
                lock.unlock();
            }
        }
    }
}
