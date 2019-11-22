package com.linbin.chapter02.example09_ThreadSuspend;

/**
 * @ClassName demo02_println
 * @Author linbin
 * @Date 2019/11/21 13:19
 * @Description ：suspend独占是println也无法打印，因为println也是同步的
 */
public class demo02_println extends Thread{
    private long i = 0;
    @Override
    public void run() {
        super.run();
        while(true){
            i++;
            System.out.println(i);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        demo02_println thread = new demo02_println();
        thread.start();
        Thread.sleep(1000);
        thread.suspend();
        System.out.println("main end!");
    }
}

