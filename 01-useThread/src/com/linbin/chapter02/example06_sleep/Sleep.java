package com.linbin.chapter02.example06_sleep;

public class Sleep extends Thread {
    @Override
    public void run() {
        System.out.println("执行开始:" + System.currentTimeMillis());
        try {
            Thread.sleep(3000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("执行结束:" + System.currentTimeMillis());

    }

    public static void main(String[] args) {
        Sleep thread = new Sleep();
        thread.start();
    }
}
