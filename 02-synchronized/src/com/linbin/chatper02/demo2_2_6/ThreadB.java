package com.linbin.chatper02.demo2_2_6;

/**
 * @ClassName ThreadA
 * @Author LinBin
 * @Date 2019/11/27 14:00
 * @Description :
 */
public class ThreadB extends Thread {
    private Task task;
    //构造方法实例化
    public ThreadB(Task task){
        super();
        this.task = task;
    }
    @Override
    public void run() {
        super.run();
        task.otherMethod();
    }
}
