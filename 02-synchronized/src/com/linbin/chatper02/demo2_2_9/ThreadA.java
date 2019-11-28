package com.linbin.chatper02.demo2_2_9;

/**
 * @ClassName ThreadA
 * @Author LinBin
 * @Date 2019/11/28 11:13
 * @Description :
 */
public class ThreadA extends Thread{
    private MyService myService;
    public ThreadA(MyService myService){
        super();
        this.myService = myService;
    }

    @Override
    public void run() {
        myService.printA();
    }
}
