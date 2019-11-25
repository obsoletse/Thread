package com.linbin.chatper01.demo2_1_4._1;

/**
 * @ClassName Run
 * @Author linBin
 * @Date 2019/11/25 20:12
 * @Description ：synchronized锁的是对象，在同一对象内的实例变量一定是排队运行的，而未加时多个线程之间异步调用
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
