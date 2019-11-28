package com.linbin.chatper02.demo2_2_9;

/**
 * @ClassName Run
 * @Author LinBin
 * @Date 2019/11/28 11:15
 * @Description :
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        MyService service = new MyService();
        ThreadA threadA = new ThreadA(service);
        threadA.setName("A");
        ThreadB threadB = new ThreadB(service);
        threadB.setName("B");
        ThreadC threadC = new ThreadC(service);
        threadC.setName("C");
        threadA.start();
        threadB.start();
        threadC.start();
    }
}
