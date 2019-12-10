package com.linbin.chapter01.demo4_1_7;

/**
 * @ClassName ThreadA
 * @Author LinBin
 * @Date 2019/12/10 15:07
 * @Description :
 */
public class ThreadA extends Thread{
    private MyService myService;
    public ThreadA(MyService myService){
        this.myService = myService;
    }

    @Override
    public void run() {
        super.run();
        while (true){
            myService.product();
        }
    }
}
