package com.linbin.chatper02.demo2_2_16;

/**
 * @ClassName Run
 * @Author LinBin
 * @Date 2019/11/28 15:22
 * @Description :
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        Task task = new Task();
        ThreadA threadA = new ThreadA(task);
        threadA.setName("A");
        threadA.start();
/*        Thread.sleep(50);*/
        ThreadB threadB = new ThreadB(task);
        threadB.setName("B");
        threadB.start();
    }
}
