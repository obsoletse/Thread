package com.linbin.chatper02.demo2_2_10;

/**
 * @ClassName Service
 * @Author LinBin
 * @Date 2019/11/28 11:28
 * @Description :
 */
public class Service {
    public void printA(String data){
        try {
            synchronized (data){
                while (true){
                    System.out.println("当前执行的线程为:" + Thread.currentThread().getName());
                    Thread.sleep(1000);
                }
            }
        }catch (InterruptedException e){
            //TODO 处理异常
        }
    }
}
