package com.linbin.chatper02.demo2_2_8._3;

/**
 * @ClassName Service
 * @Author LinBin
 * @Date 2019/11/28 10:36
 * @Description :
 */
public class Service {
    public void testMethod1(MyObject object){
        try {
            synchronized (object){
                System.out.println("testMethod1 __getLock time = " + System.currentTimeMillis() + " ,run thread = " + Thread.currentThread().getName());
                Thread.sleep(2000);
                System.out.println("testMethod1 __releaseLock time = " + System.currentTimeMillis() + " ,run thread = " + Thread.currentThread().getName());
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
