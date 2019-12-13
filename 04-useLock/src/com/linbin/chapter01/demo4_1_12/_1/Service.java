package com.linbin.chapter01.demo4_1_12._1;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @ClassName Service
 * @Author LinBin
 * @Date 2019/12/13 8:49
 * @Description :
 */
public class Service {
    private ReentrantLock lock;
    public Service(boolean isFair){
        lock = new ReentrantLock(isFair);
    }

    public void method(){
        try{
            lock.lock();
            System.out.println("该锁是否为公平锁:" + lock.isFair());
        }finally {
            lock.unlock();
        }
    }
}
