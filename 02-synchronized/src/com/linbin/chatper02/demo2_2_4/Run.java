package com.linbin.chatper02.demo2_2_4;

/**
 * @ClassName Run
 * @Author LinBin
 * @Date 2019/11/27 10:07
 * @Description : 验证synchronized同步块一半异步，一半同步
 */
public class Run {
    public static void main(String[] args) {
        Task task = new Task();
        ThreadA threadA = new ThreadA(task);
        threadA.setName("A");
        threadA.start();
        ThreadB threadB = new ThreadB(task);
        threadB.setName("B");
        threadB.start();
    }
}
