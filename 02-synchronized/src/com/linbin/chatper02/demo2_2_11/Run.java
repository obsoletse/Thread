package com.linbin.chatper02.demo2_2_11;

/**
 * @ClassName Run
 * @Author LinBin
 * @Date 2019/11/28 11:39
 * @Description :
 */
public class Run {
    public static void main(String[] args) {
        Task task = new Task();
        Thread1 thread1 = new Thread1(task);
        Thread2 thread2 = new Thread2(task);
        thread1.start();
        thread2.start();
    }
}
