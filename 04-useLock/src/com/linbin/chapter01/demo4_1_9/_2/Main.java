package com.linbin.chapter01.demo4_1_9._2;

/**
 * @ClassName Main
 * @Author LinBin
 * @Date 2019/12/11 13:44
 * @Description :
 */
public class Main {
    public static void main(String[] args) {
        final Service service = new Service(false);
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                service.method();
                System.out.println("ThreadName = " + Thread.currentThread().getName() + " 运行了");

            }
        };
        Thread[] threads = new Thread[10];
        for (int i = 0 ; i < threads.length ; i ++){
            threads[i] = new Thread(runnable,("Thread" + (i+1)));
        }
        for (int i = 0 ; i < threads.length ; i ++){
            threads[i].start();
        }
    }
}
