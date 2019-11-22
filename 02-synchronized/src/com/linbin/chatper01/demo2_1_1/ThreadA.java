package com.linbin.chatper01.demo2_1_1;

/**
 * @ClassName ThreadA
 * @Author linbin
 * @Date 2019/11/21 16:48
 * @Description ：
 */
public class ThreadA extends Thread {

    private HasSafePrivateNum hasSafePrivateNum;

    public ThreadA(HasSafePrivateNum hasSafePrivateNum){
        this.hasSafePrivateNum = hasSafePrivateNum;
    }
    @Override
    public void run() {
        super.run();
        hasSafePrivateNum.addI("a");
    }
}
