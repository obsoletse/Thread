package com.linbin.chapter02.example08_ThreadStop;

/**
 * isInterrupted()判断调用该方法的线程是否中断，且不改变中断状态
 */
public class demo03_isInterrupted {
    public static void main(String[] args) {
        Thread.currentThread().interrupt();
        System.out.println("是否停止main？ = " + Thread.currentThread().isInterrupted());
        //清除中断状态所以第二次为false
        System.out.println("是否停止main？ = " + Thread.currentThread().isInterrupted());
        System.out.println("end");
    }
}