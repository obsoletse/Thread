package com.linbin.chapter02.example08_ThreadStop;

/**
 * 线程不停止案例
 * interrupt():在一个线程中调用另一个线程的interrupt()方法，即会向那个线程发出信号——线程中断状态已被设置。
 * 			    至于那个线程何去何从，由具体的代码实现决定。不会中断正在运行的线程，只会改变中断状态
 * Thread.stop()已经过期作废，不安全
 */
public class demo01_Interrupt extends Thread{
    @Override
    public void run() {
        super.run();
        for (int i = 0; i <= 1000 ; i++){
            System.out.println("i = " + i);
        }
    }

    public static void main(String[] args) {
        try{
            demo01_Interrupt myThreadInterrupt = new demo01_Interrupt();
            myThreadInterrupt.start();
            Thread.sleep(2000);
            myThreadInterrupt.interrupt();
            System.out.println(myThreadInterrupt.isInterrupted());
        }catch (InterruptedException e){
            System.out.println("main catch");
            e.printStackTrace();
        }
    }
}
