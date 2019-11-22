package com.linbin.chatper01.demo2_1_1;

/**
 * @ClassName Run
 * @Author linbin
 * @Date 2019/11/21 16:50
 * @Description ：
 */
public class Run {
    public static void main(String[] args) {
        HasSafePrivateNum hasSafePrivateNum = new HasSafePrivateNum();
        ThreadA threadA = new ThreadA(hasSafePrivateNum);
        ThreadB threadB = new ThreadB(hasSafePrivateNum);
        threadA.start();
        threadB.start();
    }
}
