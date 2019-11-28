package com.linbin.chatper02.demo2_2_8._2;

/**
 * @ClassName TheadB
 * @Author LinBin
 * @Date 2019/11/28 10:39
 * @Description :
 */
public class TheadB extends Thread {
    private MyObject object;
    public TheadB(MyObject object){
        this.object = object;
    }

    @Override
    public void run() {
        super.run();
        try {
            object.method();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
