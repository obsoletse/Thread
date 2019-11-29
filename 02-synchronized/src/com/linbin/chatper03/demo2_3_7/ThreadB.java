package com.linbin.chatper03.demo2_3_7;

/**
 * @ClassName ThreadB
 * @Author LinBin
 * @Date 2019/11/29 14:54
 * @Description :
 */
public class ThreadB extends Thread {
    private Service myService;
    public ThreadB(Service service){
        this.myService = service;
    }

    @Override
    public void run() {
        super.run();
        myService.set();
    }
}
