package com.linbin.chapter02.example10_yield;

/**
 * @ClassName demo
 * @Author linbin
 * @Date 2019/11/21 13:46
 * @Description ：yield()案例--放弃当前cpu资源，但是放弃的时间不确定，有可能刚放弃就抢占
 */
public class demo extends Thread{
    private long beginTime;
    private long endTime;
    private long count = 0;
    @Override
    public void run() {
        super.run();
        beginTime = System.currentTimeMillis();
        for (int i = 0 ; i < 50000000 ; i ++){
            Thread.yield();
            count += i;
        }
        endTime = System.currentTimeMillis();
        System.out.println("用时:" + (endTime-beginTime) + "毫秒");
    }

    public static void main(String[] args) {
        demo thread = new demo();
        thread.start();
    }
}
