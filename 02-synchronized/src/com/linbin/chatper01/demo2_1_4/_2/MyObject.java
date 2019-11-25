package com.linbin.chatper01.demo2_1_4._2;

/**
 * @ClassName MyObject
 * @Author linBin
 * @Date 2019/11/25 20:08
 * @Description ：
 */
public class MyObject {
    public void methodA(){
        synchronized (this){
            try {
                System.out.println("begin methodA 的对象是:" + Thread.currentThread().getName());
                System.out.println("A begin time:" + System.currentTimeMillis());
                Thread.sleep(4000);
                System.out.println("A end time:" + System.currentTimeMillis());
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }

    synchronized public void methodB(){
        try {
            System.out.println("begin methodB 的对象是:" + Thread.currentThread().getName());
            System.out.println("B begin time:" + System.currentTimeMillis());
            Thread.sleep(2000);
            System.out.println("B end time:" + System.currentTimeMillis());
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
