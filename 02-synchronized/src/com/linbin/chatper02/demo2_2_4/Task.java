package com.linbin.chatper02.demo2_2_4;

/**
 * @ClassName Task
 * @Author LinBin
 * @Date 2019/11/27 10:04
 * @Description :
 */
public class Task {
    public void task(){
        for (int i = 0; i < 10000; i ++){
            System.out.println("no synchronized threadName = " + Thread.currentThread().getName() + " i = " + (i+1));
        }
        System.out.println("");
        synchronized (this){
            for (int i = 0; i < 100; i ++){
                System.out.println("synchronized threadName = " + Thread.currentThread().getName() + " i = " + (i+1));
            }
        }
    }
}
