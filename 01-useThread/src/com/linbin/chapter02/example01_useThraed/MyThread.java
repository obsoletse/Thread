package com.linbin.chapter02.example01_useThraed;

public class MyThread extends Thread{
    @Override
    public void run() {
        System.out.println("通过继承Thread类创建线程");
    }

    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();
        System.out.println("运行结束!");
    }
}
