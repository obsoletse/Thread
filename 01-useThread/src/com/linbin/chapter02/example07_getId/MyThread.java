package com.linbin.chapter02.example07_getId;

public class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("run线程的Id: " + Thread.currentThread().getId());
    }

    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();
    }
}
