package com.linbin.chatper02.demo2_2_2;

/**
 * @ClassName Run
 * @Author LinBin
 * @Date 2019/11/27 9:48
 * @Description :
 */
public class Run {
    public static void main(String[] args) {
        Service service = new Service();
        ThreadA threadA = new ThreadA(service);
        ThreadB threadB = new ThreadB(service);
        threadA.start();
        threadB.start();
    }
}
