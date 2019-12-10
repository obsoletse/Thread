package com.linbin.chapter01.demo4_1_8;

/**
 * @ClassName Run
 * @Author LinBin
 * @Date 2019/12/10 15:30
 * @Description :
 */
public class Run {
    public static void main(String[] args) {
        MyService myService = new MyService();
        ThreadA[] threadAS = new ThreadA[10];
        ThreadB[] threadBS = new ThreadB[10];
        for (int i = 0 ; i < 2 ; i ++){
            threadAS[i] = new ThreadA(myService);
            threadAS[i].setName("product" + (i+1));
            threadBS[i] = new ThreadB(myService);
            threadBS[i].setName("consumption" + (i+1));
            threadAS[i].start();
            threadBS[i].start();
        }
    }
}
