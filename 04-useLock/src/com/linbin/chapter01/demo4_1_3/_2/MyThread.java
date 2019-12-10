package com.linbin.chapter01.demo4_1_3._2;

/**
 * @ClassName MyThread
 * @Author LinBin
 * @Date 2019/12/10 13:14
 * @Description :
 */
public class MyThread extends Thread {
    private MyService myService;
    public MyThread(MyService service){
        this.myService = service;
    }

    @Override
    public void run() {
        myService.await();
    }
}
