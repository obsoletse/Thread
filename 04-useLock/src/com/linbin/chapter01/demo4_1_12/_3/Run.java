package com.linbin.chapter01.demo4_1_12._3;

/**
 * @ClassName Run
 * @Author LinBin
 * @Date 2019/12/13 9:13
 * @Description :
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        boolean isFair = true;
        Service service = new Service();
        Runnable runnable = () -> {
            try {
                service.method();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };
        service.isLock();
        Thread thread = new Thread(runnable,"A");
        thread.start();
        Thread.sleep(1000);
        service.isLock();
    }
}
