package com.linbin.chatper02.demo2_2_5;

/**
 * @ClassName ThreadA
 * @Author LinBin
 * @Date 2019/11/27 13:20
 * @Description :
 */
public class ThreadA implements Runnable {
    private Service service;
    public ThreadA(Service service){
        super();
        this.service = service;
    }
    @Override
    public void run() {
        service.method1();
    }
}
