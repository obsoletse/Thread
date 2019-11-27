package com.linbin.chatper02.demo2_2_2;

/**
 * @ClassName ThreadB
 * @Author LinBin
 * @Date 2019/11/27 9:47
 * @Description :
 */
public class ThreadB extends Thread{
    private Service service;
    public ThreadB(Service service){
        super();
        this.service = service;
    }

    @Override
    public void run() {
        super.run();
        try {
            service.service();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
