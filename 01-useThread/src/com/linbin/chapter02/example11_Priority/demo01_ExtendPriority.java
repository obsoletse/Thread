package com.linbin.chapter02.example11_Priority;

/**
 * @ClassName demo01_ExtendPriority
 * @Author linbin
 * @Date 2019/11/21 14:17
 * @Description ：线程的继承特性--A线程启动B线程，B线程的优先级和A线程的一致
 */
public class demo01_ExtendPriority {
    public static void main(String[] args) {
        Thread thread1 = new Thread(){
            @Override
            public void run() {
                System.out.println("thread1 的优先级是" + this.getPriority());
            }
        };
        Thread.currentThread().setPriority(6);
        Thread thread2 = new Thread(){
            @Override
            public void run() {
                System.out.println("thread2 的优先级是" + this.getPriority());
            }
        };
        thread1.start();
        thread2.start();
    }
}
