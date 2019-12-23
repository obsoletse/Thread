package com.linbin.chapter01.demo4_1_13._2;

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
                service.method();
            }
        };

        Thread threadA = new Thread(runnable,"a");
        Thread threadB = new Thread(runnable,"b");
        threadA.start();
        threadB.start();
    }
}
