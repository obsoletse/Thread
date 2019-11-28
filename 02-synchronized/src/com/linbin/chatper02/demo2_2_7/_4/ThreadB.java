package com.linbin.chatper02.demo2_2_7._4;

/**
 * @ClassName ThreadA
 * @Author LinBin
 * @Date 2019/11/28 10:04
 * @Description :
 */
public class ThreadB extends Thread{
    private MyList list;
    public ThreadB(MyList list){
        super();
        this.list = list;
    }

    @Override
    public void run() {
        super.run();
        MyService service = new MyService();
        service.addMethod(list,"B");
    }
}
