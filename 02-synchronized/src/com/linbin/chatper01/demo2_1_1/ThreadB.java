package com.linbin.chatper01.demo2_1_1;

/**
 * @ClassName ThreadA
 * @Author linbin
 * @Date 2019/11/21 16:48
 * @Description ： 线程方法内的变量线程安全
 */
public class ThreadB extends Thread {

    private HasSafePrivateNum hasSafePrivateNum;

    public ThreadB(HasSafePrivateNum hasSafePrivateNum){
        this.hasSafePrivateNum = hasSafePrivateNum;
    }
    @Override
    public void run() {
        super.run();
        hasSafePrivateNum.addI("b");
    }
}
