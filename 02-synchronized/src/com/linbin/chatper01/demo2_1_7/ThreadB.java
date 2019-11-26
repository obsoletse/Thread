package com.linbin.chatper01.demo2_1_7;

/**
 * @ClassName ThreadA
 * @Author LinBin
 * @Date 2019/11/26 14:10
 * @Description ：
 */
public class ThreadB extends Thread {
    private Service service;
    public ThreadB(Service service){
        super();
        this.service = service;
    }

    @Override
    public void run() {
        super.run();
        service.Service();
    }
}
