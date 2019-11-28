package com.linbin.chatper02.demo2_2_11;

/**
 * @ClassName Thread1
 * @Author LinBin
 * @Date 2019/11/28 11:38
 * @Description :
 */
public class Thread1 extends Thread{
    private Task task;
    public Thread1(Task task){
        super();
        this.task = task;
    }

    @Override
    public void run() {
        super.run();
        task.methodA();
    }
}
