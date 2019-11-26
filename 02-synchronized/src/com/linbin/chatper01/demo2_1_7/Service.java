package com.linbin.chatper01.demo2_1_7;

/**
 * @ClassName Service
 * @Author LinBin
 * @Date 2019/11/26 14:05
 * @Description ：出现异常释放锁,其他线程可以获得这个同步锁对象
 */
public class Service {
    synchronized public void Service(){
        if (Thread.currentThread().getName().equals("a")){
            System.out.println("ThreadName = " + Thread.currentThread().getName() + " ，begin time = " + System.currentTimeMillis());
            int i = 1;
            while (i == 1){
                if(("" + Math.random()).substring(0,8).equals("0.123456")){
                    System.out.println("ThreadName = " + Thread.currentThread().getName() + " ，exception time = " + System.currentTimeMillis());
                    Integer.parseInt("a");
                }
            }
        }else {
            System.out.println("Thread B run time = " + System.currentTimeMillis());
        }
    }
}
