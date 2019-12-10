package com.linbin.chapter01.demo4_1_5;

/**
 * @ClassName ThreadC
 * @Author LinBin
 * @Date 2019/12/10 14:35
 * @Description :
 */
public class ThreadC extends Thread {
    private MyService myService;
    public ThreadC(MyService myService){
        this.myService = myService;
    }

    @Override
    public void run() {
        super.run();
        myService.signalAll();
    }
}
