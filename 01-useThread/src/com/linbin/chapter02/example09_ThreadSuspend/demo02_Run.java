package com.linbin.chapter02.example09_ThreadSuspend;

import com.linbin.chapter02.example05_isAlive.Run;

/**
 * @ClassName demo02_Run
 * @Author linbin
 * @Date 2019/11/21 11:34
 * @Description ：suspend独占demo
 */
public class demo02_Run {
    public static void main(String[] args) {
        try {
            final demo02_SynchronizedObject object  = new demo02_SynchronizedObject();
            /*线程1*/
            Thread thread1 = new Thread(){
                @Override
                public void run() {
                    super.run();
                    object.printString();
                }
            };
            thread1.setName("a");
            thread1.start();
            Thread.sleep(1000);
            /*线程2*/
            Thread thread2  = new Thread(){
                @Override
                public void run() {
                    super.run();
                    System.out.println("thread2启动了!,但是进入不了printString方法，只打印了一个begin");
                    System.out.println("因为printString被a线程锁定了且永远suspend暂停了!");
                    object.printString();
                }
            };
            thread2.start();//线程2拿不到printString因此一值阻塞等待

        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
