package com.linbin.chatper02.demo2_2_1;

/**
 * @ClassName ThreadA
 * @Author LinBin
 * @Date 2019/11/27 9:13
 * @Description :
 */
public class ThreadA extends Thread {
    private Task task;
    public ThreadA(Task task){
        super();
        this.task = task;
    }

    @Override
    public void run() {
        super.run();
        CommonUtils.beginTime1 = System.currentTimeMillis();
        task.method();
        CommonUtils.endTime1 = System.currentTimeMillis();
    }
}
