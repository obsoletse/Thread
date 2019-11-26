package com.linbin.chatper01.demo2_1_8;

/**
 * @ClassName Main
 * @Author LinBin
 * @Date 2019/11/26 14:57
 * @Description ：父类
 */
public class Main {
    synchronized public void method(){
        try {
            System.out.println("in main 下一步操作为sleep,当前线程 = " + Thread.currentThread().getName() + " ,begin time = " + System.currentTimeMillis());
            Thread.sleep(2000);
            System.out.println("in main sleep操作完成,当前线程 = " + Thread.currentThread().getName() + " ,end time = " + System.currentTimeMillis());
        }catch (InterruptedException e){
            e.printStackTrace();
        }

    }
}
