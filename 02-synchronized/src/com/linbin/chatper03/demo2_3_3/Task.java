package com.linbin.chatper03.demo2_3_3;

/**
 * @ClassName Task
 * @Author LinBin
 * @Date 2019/11/28 15:45
 * @Description :
 */
public class Task implements Runnable{

    volatile private boolean isContinuePrint = true;

    public boolean isContinuePrint() {
        return isContinuePrint;
    }

    public void setContinuePrint(boolean continuePrint) {
        isContinuePrint = continuePrint;
    }

    @Override
    public void run() {
        System.out.println("进入run了!");
        while (isContinuePrint == true){}
        System.out.println("线程停止!");
    }
}
