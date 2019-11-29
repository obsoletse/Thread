package com.linbin.chatper03.demo2_3_6;

/**
 * @ClassName ThreadA
 * @Author LinBin
 * @Date 2019/11/29 14:54
 * @Description :
 */
public class ThreadA extends Thread {
    private MyService myService;
    public ThreadA(MyService service){
        this.myService = service;
    }

    @Override
    public void run() {
        super.run();
        myService.addNum();
    }
}
