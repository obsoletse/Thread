package com.linbin.chatper02.demo2_2_5;

import com.linbin.chatper02.demo2_2_4.ThreadB;

/**
 * @ClassName Service
 * @Author LinBin
 * @Date 2019/11/27 13:17
 * @Description :
 */
public class Service {
    public void method1(){
        try {
            synchronized (this){
                System.out.println("ThreadName = " + Thread.currentThread().getName() + " begin time = " + System.currentTimeMillis());
                Thread.sleep(2000);
                System.out.println("ThreadName = " + Thread.currentThread().getName() + " end time = " + System.currentTimeMillis());
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    public void method2(){
        try {
            synchronized (this){
                System.out.println("ThreadName = " + Thread.currentThread().getName() + " begin time = " + System.currentTimeMillis());
                Thread.sleep(3000);
                System.out.println("ThreadName = " + Thread.currentThread().getName() + " end time = " + System.currentTimeMillis());
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
