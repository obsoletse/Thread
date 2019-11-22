package com.linbin.chapter02.example08_ThreadStop;

/**
 * @ClassName demo09_StopByReturn
 * @Author LinBin
 * @Date 2019/11/21 10:35
 * @Description :
 */
public class demo09_StopByReturn extends Thread {
    private int i = 0;
    @Override
    synchronized public void run() {
        super.run();
        while (true){
            System.out.println(i++);
            if (this.interrupted()){
                System.out.println("停止了!");
                return;
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        demo09_StopByReturn thread = new demo09_StopByReturn();
        thread.start();
        Thread.sleep(5000);
        thread.interrupt();
    }
}
