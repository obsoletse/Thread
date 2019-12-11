package com.linbin.chapter01.demo4_1_10._1;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @ClassName Service
 * @Author LinBin
 * @Date 2019/12/11 14:26
 * @Description :
 */
public class Service {
    private ReentrantLock lock = new ReentrantLock();
    public void method(){
        try {
            lock.lock();
            System.out.println("method getHoldCount = " + lock.getHoldCount());
            m();
        }finally {
            lock.unlock();
        }
    }

    public void m(){
        try {
            lock.lock();
            System.out.println("m getHoldCount = " + lock.getHoldCount());
        }finally {
            lock.unlock();
        }
    }
}
