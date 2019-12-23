package com.linbin.chapter01.demo4_1_13._1;

/**
 * @ClassName Run
 * @Author LinBin
 * @Date 2019/12/13 14:46
 * @Description :
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        Service service = new Service();
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                service.waitMethod();
            }
        };

        Thread threadA = new Thread(runnable,"A");
        Thread threadB = new Thread(runnable,"B");
        threadA.start();
        Thread.sleep(1000);
        threadB.start();
        threadB.interrupt();
        System.out.println("main end");
    }
}
