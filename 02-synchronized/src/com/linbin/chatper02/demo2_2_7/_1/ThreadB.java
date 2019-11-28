package com.linbin.chatper02.demo2_2_7._1;

/**
 * @ClassName ThreadA
 * @Author LinBin
 * @Date 2019/11/28 9:06
 * @Description :
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
        service.setUsernamePassword("a","aa");
    }
}
