package com.linbin.chapter01.demo4_1_1;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @ClassName MyService
 * @Author LinBin
 * @Date 2019/12/10 9:58
 * @Description :
 */
public class MyService {
    private Lock lock = new ReentrantLock();
    public void testMethod(){
        //1.调用lock方法获取对象锁,
        lock.lock();
        for (int i = 0 ; i < 2 ; i ++){
            System.out.println("Thread name = " + Thread.currentThread().getName() + " i = " + (i+1));
        }
        //2.执行完业务释放锁
        lock.unlock();
    }
}
