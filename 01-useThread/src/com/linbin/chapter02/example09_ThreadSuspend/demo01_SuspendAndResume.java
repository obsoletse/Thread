package com.linbin.chapter02.example09_ThreadSuspend;

/**
 * @ClassName demo01_SuspendAndResume
 * @Author LinBin
 * @Date 2019/11/21 10:55
 * @Description :
 */
public class demo01_SuspendAndResume extends Thread{
    private long i = 0;

    public long getI() {
        return i;
    }

    @Override
    public void run() {
        super.run();
        try {
            while (true) {
                if (this.isInterrupted()) {
                    throw new InterruptedException();
                }
                i++;
            }
        }catch (InterruptedException e) {
            System.out.println("线程停止!");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        demo01_SuspendAndResume thread = new demo01_SuspendAndResume();
        thread.start();
        Thread.sleep(1000);
        thread.suspend();
        //A段
        System.out.println("A段-当前时间为:" + System.currentTimeMillis() + " , i = " + thread.getI());
        Thread.sleep(2000);
        System.out.println("A段-当前时间为:" + System.currentTimeMillis() + " , i = " + thread.getI());
        thread.resume();
        //B段
        Thread.sleep(1000);
        thread.suspend();
        System.out.println("B段-当前时间为:" + System.currentTimeMillis() + " , i = " + thread.getI());
        Thread.sleep(2000);
        System.out.println("B段-当前时间为:" + System.currentTimeMillis() + " , i = " + thread.getI());
        thread.resume();
        thread.interrupt();
    }
}
