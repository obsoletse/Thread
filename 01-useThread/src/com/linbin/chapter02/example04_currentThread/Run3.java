package com.linbin.chapter02.example04_currentThread;

public class Run3 implements Runnable{
    public Run3(){
        System.out.println("调用构造方法的线程为:" + Thread.currentThread().getName());
    }
    @Override
    public void run() {
        System.out.println("调用run()的线程为:" + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        Run3 a = new Run3();
        Thread thread = new Thread(a);
        thread.run();//main线程调用run方法，而不是开启一个新的线程
    }
}
