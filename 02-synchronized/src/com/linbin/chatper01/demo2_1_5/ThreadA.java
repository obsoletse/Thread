package com.linbin.chatper01.demo2_1_5;

/**
 * @ClassName ThreadA
 * @Author linBin
 * @Date 2019/11/25 20:57
 * @Description ：
 */
public class ThreadA extends Thread {
    private PublicVar publicVar;
    public ThreadA(PublicVar publicVar){
        super();
        this.publicVar = publicVar;
    }

    @Override
    public void run() {
        super.run();
        try {
            publicVar.setValue("B","BB");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
