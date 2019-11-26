package com.linbin.chatper01.demo2_1_8;

/**
 * @ClassName Run
 * @Author LinBin
 * @Date 2019/11/26 15:01
 * @Description ：
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        Sub sub = new Sub();
        ThreadA threadA = new ThreadA(sub);
        threadA.setName("A");
        ThreadB threadB = new ThreadB(sub);
        threadB.setName("B");
        threadA.start();
        threadB.start();
    }
}
