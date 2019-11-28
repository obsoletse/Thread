package com.linbin.chatper02.demo2_2_9;

/**
 * @ClassName ThreadB
 * @Author LinBin
 * @Date 2019/11/28 11:13
 * @Description :
 */
public class ThreadB extends Thread{
    private MyService myService;
    public ThreadB(MyService myService){
        super();
        this.myService = myService;
    }

    @Override
    public void run() {
        myService.printB();
    }
}
