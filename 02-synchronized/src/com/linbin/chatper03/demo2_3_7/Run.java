package com.linbin.chatper03.demo2_3_7;

/**
 * @ClassName Run
 * @Author LinBin
 * @Date 2019/11/29 14:55
 * @Description :
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        Service service = new Service();
        ThreadA threadA = new ThreadA(service);
        ThreadB threadB = new ThreadB(service);
        threadA.start();
        Thread.sleep(2000);
        threadB.start();
        System.out.println("已经发起停止命令!");
    }
}
