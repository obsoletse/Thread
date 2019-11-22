package com.linbin.chapter02.example08_ThreadStop;

/**
 * Thread.interrupted()判断当前被线程是否停止,且清除中断状态
 */
public class demo04_StopMain {
    public static void main(String[] args) {
        Thread.currentThread().interrupt();
        System.out.println("是否停止main？ = " + Thread.interrupted());
        //清除中断状态所以第二次为false
        System.out.println("是否停止main？ = " + Thread.interrupted());
        System.out.println("end");
    }
}
