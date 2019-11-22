package com.linbin.chapter02.example08_ThreadStop;

/**
 * @ClassName MyThread_StopByExection
 * @Author LinBin
 * @Date 2019/11/21 9:14
 * @Description : 异常法停止线程
 *                如果没有中断跑出异常，代码还是会继续执行
 */
public class demo05_StopByException extends Thread{
    @Override
    public void run() {
        super.run();
        try {
            for (int i = 1 ; i <= 500000 ; i ++){
                if (this.interrupted()){
                    System.out.println("已经是停止状态了!我要退出了!");
                    throw new InterruptedException();
                }
                System.out.println(" i = " + i);
            }
            System.out.println("我又被输出了!线程未停止!");
        }catch (InterruptedException e){
            System.out.println("这次设置了中断异常处理,线程停止!");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        try {
            demo05_StopByException thread = new demo05_StopByException();
            thread.start();
            Thread.sleep(1000);
            thread.interrupt();
        }catch (InterruptedException e){
            System.out.println("main catch");
            e.printStackTrace();
        }
    }
}
