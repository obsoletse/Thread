package com.linbin.chapter02.example02_threadShare;

/**
 * 自定义线程类线程变量和线程安全--不共享数据
 */
public class ThreadNoShared extends Thread {
    private int count = 5;
    public ThreadNoShared(String threadName){
        super();
        this.setName(threadName);
    }
    @Override
    public void run() {
        while ( count > 0 ){
            count -- ;
            System.out.println("由" + this.currentThread().getName() + "计算count=" + count);
        }
    }

    public static void main(String[] args) {
        //每个都是独立的线程，调用自己的run()方法
        ThreadNoShared a = new ThreadNoShared("A");
        ThreadNoShared b = new ThreadNoShared("B");
        ThreadNoShared c = new ThreadNoShared("C");
        a.start();
        b.start();
        c.start();
    }
}
