package com.linbin.chapter01.demo4_1_11._1;

/**
 * @ClassName Run
 * @Author LinBin
 * @Date 2019/12/11 15:48
 * @Description :
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        final Service service = new Service();
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                service.waitMethod();
            }
        };
        Thread thread1 = new Thread(runnable,"a");
        Thread thread2 = new Thread(runnable,"b");
        thread1.start();
        Thread.sleep(500);
        thread2.start();
        Thread.sleep(2000);
        System.out.println("thread1是否等待锁:" + service.lock.hasQueuedThread(thread1));
        System.out.println("thread2是否等待锁:" + service.lock.hasQueuedThread(thread2));
        System.out.println("是否有线程等待锁:" + service.lock.hasQueuedThreads());

    }
}
