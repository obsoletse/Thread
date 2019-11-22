package com.linbin.chapter02.example08_ThreadStop;

/**
 * 测试当前线程(当前线程是指运行this.interrupted的线程,不清楚可以用currentThread打印出来)是否中断,且清除中断状态
 */
public class demo02_Interrupted extends Thread {
    int i = 0;
    @Override
    public void run() {
        super.run();
        try {
            while (true) {
                if (interrupted()) {
                    throw new InterruptedException();
                }
                //TODO    线程业务逻辑
                System.out.print("i=" + (i++) + "\n");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
            //TODO    处理线程中断

        }
    }

    public static void main(String[] args) {
        try{
            demo02_Interrupted myThread = new demo02_Interrupted();
            myThread.start();
            Thread.sleep(1000);
            myThread.interrupt();
            //Thread.currentThread().interrupt();//调用此方法可以停止当前main线程
            System.out.println("是否停止myThread线程？ = " + myThread.isInterrupted());
            System.out.println("是否停止main线程？ = " + interrupted());//当前线程是main线程，从未停止
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
