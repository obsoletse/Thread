package com.linbin.chatper02.demo2_2_7._3;

/**
 * @ClassName Service
 * @Author LinBin
 * @Date 2019/11/28 9:23
 * @Description :
 */
public class Service {
    private String anyString = new String();
    public void methodA(){
        try {
            synchronized (anyString){
                System.out.println("methodA begin thread = " + Thread.currentThread().getName());
                Thread.sleep(2000);
                System.out.println("methodA end thread = " + Thread.currentThread().getName());
            }
        }catch (InterruptedException e){
            //TODO 处理异常
            e.printStackTrace();
        }
    }

    synchronized public void methodB(){
        System.out.println("methodB begin thread = " + Thread.currentThread().getName());
        System.out.println("methodB end thread = " + Thread.currentThread().getName());
    }
}
