package com.linbin.chatper01.demo2_1_4._1;

/**
 * @ClassName MyObject
 * @Author linBin
 * @Date 2019/11/25 20:08
 * @Description ：证明synchronized锁的都是对象
 */
public class MyObject {
    public void methodA(){
        synchronized (this){
            try {
                System.out.println("begin methodA 的对象是:" + Thread.currentThread().getName());
                Thread.sleep(2000);
                System.out.println("end");
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
