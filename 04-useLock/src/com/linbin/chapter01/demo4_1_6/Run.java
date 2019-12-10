package com.linbin.chapter01.demo4_1_6;

/**
 * @ClassName Run
 * @Author LinBin
 * @Date 2019/12/10 14:36
 * @Description :
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        MyService myService = new MyService();
        ThreadA threadA = new ThreadA(myService);
        threadA.setName("A");
        ThreadB threadB = new ThreadB(myService);
        threadB.setName("B");
        ThreadC threadC = new ThreadC(myService);
        threadC.setName("C");
        threadA.start();
        threadB.start();
        Thread.sleep(3000);
        threadC.start();
    }
}
