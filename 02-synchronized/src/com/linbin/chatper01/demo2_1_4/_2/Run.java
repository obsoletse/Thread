package com.linbin.chatper01.demo2_1_4._2;

/**
 * @ClassName Run
 * @Author linBin
 * @Date 2019/11/25 20:12
 * @Description ：锁对象的效果
 */
public class Run {
    public static void main(String[] args) {
        MyObject object = new MyObject();
        ThreadA threadA = new ThreadA(object);
        threadA.setName("A");
        ThreadB threadB = new ThreadB(object);
        threadB.setName("B");
        threadA.start();
        threadB.start();
    }
}
