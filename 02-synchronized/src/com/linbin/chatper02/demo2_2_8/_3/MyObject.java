package com.linbin.chatper02.demo2_2_8._3;

/**
 * @ClassName MyObject
 * @Author LinBin
 * @Date 2019/11/28 10:36
 * @Description :
 */
public class MyObject {
    public void method() throws InterruptedException {
        synchronized (this){
            System.out.println("我正在运行MyObject，begin = "  + System.currentTimeMillis());
            Thread.sleep(2000);
            System.out.println("我正在运行MyObject，end = "  + System.currentTimeMillis());
        }
    }
}
