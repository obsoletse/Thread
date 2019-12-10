package com.linbin.chapter01.demo4_1_4;

/**
 * @ClassName ThreadA
 * @Author LinBin
 * @Date 2019/12/10 13:29
 * @Description :
 */
public class ThreadA extends Thread {
    private MyService myService;
    public ThreadA(MyService myService){
        this.myService = myService;
    }

    @Override
    public void run() {
        super.run();
        myService.await();
    }
}
