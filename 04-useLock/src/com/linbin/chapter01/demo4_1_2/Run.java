package com.linbin.chapter01.demo4_1_2;

/**
 * @ClassName Run
 * @Author LinBin
 * @Date 2019/12/10 10:24
 * @Description :
 */
public class Run {
    public static void main(String[] args) {
        MyService myService = new MyService();
        ThreadA threadA = new ThreadA(myService);
        threadA.setName("A");
        ThreadB threadB = new ThreadB(myService);
        threadB.setName("B");
        threadA.start();
        threadB.start();
    }
}
