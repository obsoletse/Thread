package com.linbin.chapter01.demo4_1_1;

/**
 * @ClassName MyThread
 * @Author LinBin
 * @Date 2019/12/10 10:03
 * @Description :
 */
public class MyThread implements Runnable {
    private MyService myService;
    public MyThread(MyService myService){
        this.myService = myService;
    }
    @Override
    public void run() {
        myService.testMethod();
    }
}
