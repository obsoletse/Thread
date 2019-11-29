package com.linbin.chatper03.demo2_3_3;

/**
 * @ClassName Run
 * @Author LinBin
 * @Date 2019/11/29 9:40
 * @Description :
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        Task task = new Task();
        Thread thread = new Thread(task);
        thread.start();
        Thread.sleep(2000);
        task.setContinuePrint(false);
        System.out.println("已经赋值为false了");
    }
}
