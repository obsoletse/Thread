package com.linbin.chapter01.demo4_1_7;

/**
 * @ClassName Run
 * @Author LinBin
 * @Date 2019/12/10 15:08
 * @Description :
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        MyService myService = new MyService();
        ThreadA threadA = new ThreadA(myService);
        ThreadB threadB = new ThreadB(myService);
        threadA.start();
        Thread.sleep(2000);
        threadB.start();
    }
}
