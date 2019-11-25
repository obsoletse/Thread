package com.linbin.chatper01.demo2_1_6._2;

/**
 * @ClassName MyThread
 * @Author linBin
 * @Date 2019/11/25 21:39
 * @Description ：
 */
public class MyThread extends Thread{
    @Override
    public void run() {
        super.run();
        Sub sub = new Sub();
        sub.operateISubMethod();
    }
}
