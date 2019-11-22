package com.linbin.chapter02.example08_ThreadStop;

/**
 * @ClassName demo06_StopAtSleep
 * @Author LinBin
 * @Date 2019/11/21 9:38
 * @Description : 在线程休眠时停止线程:会直接抛出中断异常InterruptedException
 */
public class demo06_StopAtSleep extends Thread{
    @Override
    public void run() {
        super.run();
        try{
            System.out.println("run begin");
            Thread.sleep(200000);
            System.out.println("run end");
        }catch (InterruptedException e){
            System.out.println("在沉睡中被停止!进入catch!" + this.isInterrupted());
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        demo06_StopAtSleep thread = new demo06_StopAtSleep();
        thread.start();
        Thread.sleep(2000);
        thread.interrupt();
    }
}
