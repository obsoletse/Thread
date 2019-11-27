package com.linbin.chatper02.demo2_2_6;


/**
 * @ClassName Run
 * @Author LinBin
 * @Date 2019/11/27 13:21
 * @Description : synchronized 锁对象的验证
 */
public class Run {
    public static void main(String[] args) {
        Task task = new Task();
        ThreadA threadA = new ThreadA(task);
        ThreadB threadB = new ThreadB(task);
        threadA.start();
        threadB.start();
    }
}
