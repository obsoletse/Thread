package com.linbin.chatper02.demo2_2_16;

/**
 * @ClassName ThreadA
 * @Author LinBin
 * @Date 2019/11/28 15:21
 * @Description :
 */
public class ThreadB extends Thread {
    private Task task;
    public ThreadB(Task task){
        super();
        this.task = task;
    }

    @Override
    public void run() {
        super.run();
        task.testMethod();
    }
}
