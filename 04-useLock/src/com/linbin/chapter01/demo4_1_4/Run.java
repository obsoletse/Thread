package com.linbin.chapter01.demo4_1_4;

/**
 * @ClassName Run
 * @Author LinBin
 * @Date 2019/12/10 13:30
 * @Description :
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        MyService myService = new MyService();
        ThreadA threadA = new ThreadA(myService);
        ThreadB threadB = new ThreadB(myService);
        threadA.start();
        Thread.sleep(5000);
        threadB.start();
    }
}
