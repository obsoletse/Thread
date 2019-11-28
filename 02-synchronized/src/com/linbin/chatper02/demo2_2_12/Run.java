package com.linbin.chatper02.demo2_2_12;

/**
 * @ClassName Run
 * @Author LinBin
 * @Date 2019/11/28 13:58
 * @Description :
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        deadThread deadThread = new deadThread();
        deadThread.setFlag("a");
        Thread thread1 = new Thread(deadThread);
        thread1.setName("A");
        thread1.start();
        Thread.sleep(2000);
        Thread thread2 = new Thread(deadThread);
        deadThread.setFlag("b");
        thread2.setName("B");
        thread2.start();
    }
}
