package com.linbin.chapter01.demo4_1_3._2;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @ClassName MyService
 * @Author LinBin
 * @Date 2019/12/10 10:46
 * @Description :
 */
public class MyService {
    private Lock lock = new ReentrantLock();//声明锁对象
    private Condition condition = lock.newCondition();//声明对象监视器
    public void await(){
        try{
            lock.lock();
            System.out.println("A");
            condition.await();
            System.out.println("B");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }
}
