package com.linbin.chatper02.demo2_2_11;

/**
 * @ClassName Task
 * @Author LinBin
 * @Date 2019/11/28 11:37
 * @Description : 同步造成死循环
 */
public class Task {
    public void methodA(){
        synchronized(new Object()){
            System.out.println("methodA begin");
            boolean isContinueRun = true;
            while (isContinueRun){

            }
            System.out.println("methodA end");
        }
    }

    synchronized public void methodB(){
        synchronized (new Object()){
            System.out.println("methodB begin");
            System.out.println("methodB end");
        }
    }
}
