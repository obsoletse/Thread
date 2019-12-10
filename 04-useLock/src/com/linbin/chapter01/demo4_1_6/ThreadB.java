package com.linbin.chapter01.demo4_1_6;

/**
 * @ClassName ThreadB
 * @Author LinBin
 * @Date 2019/12/10 14:35
 * @Description :
 */
public class ThreadB extends Thread {
    private MyService myService;
    public ThreadB(MyService myService){
        this.myService = myService;
    }

    @Override
    public void run() {
        super.run();
        myService.await2();
    }
}
