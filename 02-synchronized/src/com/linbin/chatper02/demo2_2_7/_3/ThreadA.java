package com.linbin.chatper02.demo2_2_7._3;

/**
 * @ClassName ThreadA
 * @Author LinBin
 * @Date 2019/11/28 9:06
 * @Description :
 */
public class ThreadA extends Thread {
    private Service service;
    public ThreadA(Service service){
        super();
        this.service = service;
    }

    @Override
    public void run() {
        super.run();
        service.methodA();
    }
}
