package com.linbin.chapter01.demo4_1_8;

/**
 * @ClassName ThreadB
 * @Author LinBin
 * @Date 2019/12/10 15:07
 * @Description :
 */
public class ThreadB extends Thread{
    private MyService myService;
    public ThreadB(MyService myService){
        this.myService = myService;
    }

    @Override
    public void run() {
        super.run();
        while (true){
            myService.consumption();
        }
    }
}
