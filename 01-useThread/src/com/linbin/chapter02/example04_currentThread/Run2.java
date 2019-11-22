package com.linbin.chapter02.example04_currentThread;

public class Run2 implements Runnable {
    public Run2(){
        System.out.println("调用构造方法的线程为:" + Thread.currentThread().getName());
    }
    @Override
    public void run() {
        System.out.println("调用run()的线程为:" + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        Run2 a = new Run2();
        Thread thread = new Thread(a);
        thread.start();
    }
}
