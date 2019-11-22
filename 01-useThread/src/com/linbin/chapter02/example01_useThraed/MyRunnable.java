package com.linbin.chapter02.example01_useThraed;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("通过实现Runnable接口来创建线程");
    }

    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        //传入接口运行线程
        Thread thread = new Thread(myRunnable,"myRunnable");
        thread.start();
        System.out.println(thread.getName());
    }
}
