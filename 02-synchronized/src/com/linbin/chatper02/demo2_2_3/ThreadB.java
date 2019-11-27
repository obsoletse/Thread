package com.linbin.chatper02.demo2_2_3;

/**
 * @ClassName ThreadB
 * @Author LinBin
 * @Date 2019/11/27 9:13
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
        CommonUtils.beginTime2 = System.currentTimeMillis();
        task.method();
        CommonUtils.endTime2 = System.currentTimeMillis();
    }
}
