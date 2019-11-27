package com.linbin.chatper02.demo2_2_5;

/**
 * @ClassName ThreadB
 * @Author LinBin
 * @Date 2019/11/27 13:20
 * @Description :
 */
public class ThreadB implements Runnable {
    private Service service;
    public ThreadB(Service service){
        super();
        this.service = service;
    }
    @Override
    public void run() {
        service.method1();
    }
}
