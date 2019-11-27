package com.linbin.chatper02.demo2_2_6;

import com.linbin.chatper02.demo2_2_4.ThreadA;

/**
 * @ClassName Task
 * @Author LinBin
 * @Date 2019/11/27 13:57
 * @Description :
 */
public class Task {
    synchronized public void otherMethod(){
        System.out.println("--- run otherMethod ---");
    }

    public void doLongTimeTask(){
        synchronized (this){
            for (int i = 0 ; i < 1000 ; i++){
                System.out.println("synchronized thread = " + Thread.currentThread().getName() + " i = " + (i+1));
            }
        }
    }
}
