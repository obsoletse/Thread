package com.linbin.chatper02.demo2_2_8._2;

/**
 * @ClassName TheadA
 * @Author LinBin
 * @Date 2019/11/28 10:39
 * @Description :
 */
public class TheadA extends Thread {
    private MyObject object;
    public TheadA(MyObject object){
        this.object = object;
    }

    @Override
    public void run() {
        super.run();
        Service service = new Service();
        service.testMethod1(object);
    }
}
