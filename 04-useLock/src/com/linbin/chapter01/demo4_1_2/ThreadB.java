package com.linbin.chapter01.demo4_1_2;

/**
 * @ClassName ThreadB
 * @Author LinBin
 * @Date 2019/12/10 10:20
 * @Description :
 */
public class ThreadB extends Thread {
    private MyService myService;
    public ThreadB(MyService service){
        this.myService = service;
    }

    @Override
    public void run() {
        super.run();
        myService.methodB();
    }
}
