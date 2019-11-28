package com.linbin.chatper02.demo2_2_9;

/**
 * @ClassName ThreadC
 * @Author LinBin
 * @Date 2019/11/28 11:13
 * @Description :
 */
public class ThreadC extends Thread{
    private MyService myService;
    public ThreadC(MyService myService){
        super();
        this.myService = myService;
    }

    @Override
    public void run() {
        myService.printC();
    }
}
