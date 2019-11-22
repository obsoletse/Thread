package com.linbin.chapter02.example08_ThreadStop;

/**
 * @ClassName demo07_StopByStop
 * @Author LinBin
 * @Date 2019/11/21 9:57
 * @Description : stop()方法强制停止线程;但是是一个过期作废的方法，有可能是一些清理工作得不到完成或者对锁定的对象释放锁导致数据不一致问题
 */
public class demo07_StopByStop extends Thread {
    private int i = 0;
    @Override
    public void run() {
        super.run();
        try {
            while (true){
                i++;
                System.out.println(" i = " + i);
                Thread.sleep(1000);
            }
        }catch (InterruptedException e){
            // TODO
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        try {
            demo07_StopByStop thread = new demo07_StopByStop();
            thread.start();
            Thread.sleep(8000);
            thread.stop();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
