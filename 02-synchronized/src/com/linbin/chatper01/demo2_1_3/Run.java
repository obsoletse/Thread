package com.linbin.chatper01.demo2_1_3;

/**
 * @ClassName Run
 * @Author linbin
 * @Date 2019/11/21 16:50
 * @Description ：多个对象多个锁
 */
public class Run {
    public static void main(String[] args) {
        HasSafePrivateNum hasSafePrivateNum1 = new HasSafePrivateNum();
        HasSafePrivateNum hasSafePrivateNum2 = new HasSafePrivateNum();
        ThreadA threadA = new ThreadA(hasSafePrivateNum1); //对象1的锁
        ThreadB threadB = new ThreadB(hasSafePrivateNum2); //对象2的锁
        threadA.start();
        threadB.start();
    }
}
