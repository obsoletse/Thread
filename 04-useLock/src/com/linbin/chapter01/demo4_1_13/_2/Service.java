package com.linbin.chapter01.demo4_1_13._2;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @ClassName Service
 * @Author linBin
 * @Date 2019/12/23 11:19
 * @Description ：
 */
public class Service {
    private ReentrantLock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();
    public void method(){
        if (lock.tryLock()){
            System.out.println("Thread " + Thread.currentThread().getName() + " 获取锁");
        }else {
            System.out.println("Thread " + Thread.currentThread().getName() + " 未获取锁");
        }
    }
}
