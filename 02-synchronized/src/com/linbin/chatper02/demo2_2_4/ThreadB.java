package com.linbin.chatper02.demo2_2_4;

/**
 * @ClassName ThreadB
 * @Author LinBin
 * @Date 2019/11/27 10:06
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
        task.task();
    }
}
