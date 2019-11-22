package com.linbin.chapter02.example04_currentThread;

/**
 * Thread.currentThread()获取当期线程的引用,即该代码段被哪个线程调用
 */
public class Run1 {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
    }
}
