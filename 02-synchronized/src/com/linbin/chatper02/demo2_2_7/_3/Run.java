package com.linbin.chatper02.demo2_2_7._3;

/**
 * @ClassName Run
 * @Author LinBin
 * @Date 2019/11/27 13:21
 * @Description : synchronized 代码块之间的同步性验证
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
