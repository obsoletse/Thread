package com.linbin.chapter01.demo4_1_12._2;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @ClassName Service
 * @Author LinBin
 * @Date 2019/12/13 9:33
 * @Description :
 */
public class Service {
    private ReentrantLock lock = new ReentrantLock();
    public void method(){
        System.out.println("当前线程是:" + Thread.currentThread().getName() + " ,是否持有该锁对象:" + lock.isHeldByCurrentThread());
        lock.lock();
        System.out.println("当前线程是:" + Thread.currentThread().getName() + " ,是否持有该锁对象:" + lock.isHeldByCurrentThread());
        lock.unlock();
    }
}
