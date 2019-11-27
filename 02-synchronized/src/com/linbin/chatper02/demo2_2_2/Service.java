package com.linbin.chatper02.demo2_2_2;

/**
 * @ClassName Service
 * @Author LinBin
 * @Date 2019/11/27 9:46
 * @Description :
 */
public class Service {
    public void service() throws InterruptedException {
        synchronized (this){
            System.out.println(" begin time = " + System.currentTimeMillis());
            Thread.sleep(2000);
            System.out.println(" end time = " + System.currentTimeMillis());
        }
    }
}
