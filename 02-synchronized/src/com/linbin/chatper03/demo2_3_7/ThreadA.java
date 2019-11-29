package com.linbin.chatper03.demo2_3_7;


/**
 * @ClassName ThreadA
 * @Author LinBin
 * @Date 2019/11/29 14:54
 * @Description :
 */
public class ThreadA extends Thread {
    private Service myService;
    public ThreadA(Service service){
        this.myService = service;
    }

    @Override
    public void run() {
        super.run();
        myService.runMethod();
    }
}
