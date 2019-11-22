package com.linbin.chapter02.example05_isAlive;

public class Run extends Thread {
    @Override
    public void run() {
        System.out.println("run = " + this.isAlive());
    }

    public static void main(String[] args) throws InterruptedException {
        Run a = new Run();
        System.out.println("begin = " + a.isAlive());
        a.start();
        System.out.println("end = " + a.isAlive());
    }
}
