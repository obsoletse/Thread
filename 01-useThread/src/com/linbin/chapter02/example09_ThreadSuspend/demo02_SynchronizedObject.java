package com.linbin.chapter02.example09_ThreadSuspend;

/**
 * @ClassName demo02_SynchronizedObject
 * @Author linbin
 * @Date 2019/11/21 11:31
 * @Description ：同步对象类
 */
public class demo02_SynchronizedObject {
    synchronized public void printString(){
        System.out.println("begin");
        if (Thread.currentThread().getName().equals("a")){
            System.out.println("a线程被永远的suspend了!");
            Thread.currentThread().suspend();
        }
        System.out.println("end");
    }
}
