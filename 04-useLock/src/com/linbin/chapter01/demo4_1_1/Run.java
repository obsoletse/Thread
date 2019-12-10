package com.linbin.chapter01.demo4_1_1;

/**
 * @ClassName Run
 * @Author LinBin
 * @Date 2019/12/10 10:04
 * @Description :
 */
public class Run {
    public static void main(String[] args) {
        MyService myService = new MyService();
        Thread threadA = new Thread(new MyThread(myService),"A");
        Thread threadB = new Thread(new MyThread(myService),"B");
        Thread threadC = new Thread(new MyThread(myService),"C");
        threadA.start();
        threadB.start();
        threadC.start();
    }
}
