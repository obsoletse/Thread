package com.linbin.chapter02.example02_threadShare;

/**
 * 自定义线程类线程变量和线程安全--共享数据
 */
public class ThreadShared extends Thread {
    private int count = 5;
    @Override
    synchronized public void run() {
        super.run();
        count -- ;
        System.out.println("由" + this.currentThread().getName() + "计算count=" + count);
    }

    public static void main(String[] args) {
        //调用的是用一个线程,所以实现数据共享
        ThreadShared thread = new ThreadShared();
        Thread threadA = new Thread(thread,"A");
        Thread threadB = new Thread(thread,"B");
        Thread threadC = new Thread(thread,"C");
        threadA.start();
        threadB.start();
        threadC.start();
    }
}
