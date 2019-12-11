package com.linbin.chapter01.demo4_1_11._1;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @ClassName Service
 * @Author LinBin
 * @Date 2019/12/11 15:47
 * @Description :
 */
public class Service {
    public ReentrantLock lock = new ReentrantLock();
    public void waitMethod(){
        try {
            lock.lock();
            Thread.sleep(Integer.MAX_VALUE);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }
}
