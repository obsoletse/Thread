package com.linbin.chatper03.demo2_3_5;

/**
 * @ClassName test
 * @Author LinBin
 * @Date 2019/11/29 14:38
 * @Description :
 */
public class test {
    public static void main(String[] args) {
        AtomicThread atomicThread = new AtomicThread();
        Thread thread1 = new Thread(atomicThread);
        Thread thread2 = new Thread(atomicThread);
        Thread thread3 = new Thread(atomicThread);
        Thread thread4 = new Thread(atomicThread);
        Thread thread5 = new Thread(atomicThread);
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
    }
}
