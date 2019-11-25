package com.linbin.chatper01.demo2_1_4._1;

/**
 * @ClassName ThreadB
 * @Author linBin
 * @Date 2019/11/25 20:11
 * @Description ：
 */
public class ThreadB extends Thread {
    private MyObject object;
    public ThreadB(MyObject object){
        super();
        this.object = object;
    }
    @Override
    public void run() {
        super.run();
        object.methodA();
    }
}
