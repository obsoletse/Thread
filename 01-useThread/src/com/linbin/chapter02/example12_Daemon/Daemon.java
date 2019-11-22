package com.linbin.chapter02.example12_Daemon;

/**
 * @ClassName example12_Daemon
 * @Author linbin
 * @Date 2019/11/21 15:52
 * @Description ：
 */
public class Daemon {
    public static void main(String[] args) throws Exception{
        // TODO Auto-generated method stub
        Thread thread1 = new Thread(new Soldier(),"小兵1号");
        Thread thread2 = new Thread(new Soldier(),"小兵2号");
        Thread thread3 = new Thread(new Soldier(),"小兵3号");
        Thread thread4 = new Thread(new Soldier(),"小兵4号");

        //设置为守护线程
        thread1.setDaemon(true);
        thread2.setDaemon(true);
        thread3.setDaemon(true);
        thread4.setDaemon(true);

        //启动线程
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

        for(int i = 10; i > 0; i--) {
            System.out.println("Boss掉了1滴血，剩余" + (i-1));
            Thread.sleep(100);
        }
    }

}
class Soldier implements Runnable{

    @Override
    public void run() {
        // TODO Auto-generated method stub
        for (int i = 1000; i > 0; i--) {
            System.out.println(Thread.currentThread().getName() + "掉了1滴血，剩余" + i);
            try {
                Thread.sleep(50);
            } catch (Exception e) {
                // TODO: handle exception
                e.printStackTrace();
            }
        }
    }
}
