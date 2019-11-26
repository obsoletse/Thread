package com.linbin.chatper01.demo2_1_8;

/**
 * @ClassName ThreadA
 * @Author LinBin
 * @Date 2019/11/26 15:09
 * @Description ：
 */
public class ThreadA extends Thread {
    private Sub sub;
    public ThreadA(Sub sub){
        super();
        this.sub = sub;
    }
    @Override
    public void run() {
        sub.method();
    }
}
