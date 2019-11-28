package com.linbin.chatper02.demo2_2_10;

/**
 * @ClassName Run
 * @Author LinBin
 * @Date 2019/11/28 11:31
 * @Description :
 */
public class Run {
    public static void main(String[] args) {
        Service service = new Service();
        ThreadA threadA = new ThreadA(service);
        ThreadB threadB = new ThreadB(service);
        threadA.setName("A");
        threadB.setName("B");
        threadA.start();
        threadB.start();
    }
}
