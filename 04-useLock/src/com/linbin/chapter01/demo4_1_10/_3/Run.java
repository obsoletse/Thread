package com.linbin.chapter01.demo4_1_10._3;


/**
 * @ClassName Run
 * @Author LinBin
 * @Date 2019/12/11 14:36
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
        Thread[] threads = new Thread[10];
        for (int i = 0 ; i < threads.length ; i ++){
            threads[i] = new Thread(runnable,("Thread" + (i+1)));
        }
        for (int i = 0 ; i < threads.length ; i ++){
            threads[i].start();
        }
        Thread.sleep(2000);
        service.notifyMethod();
    }
}
