package com.linbin.chapter02.example11_Priority;

import java.util.Random;

/**
 * @ClassName demo02_RandomPriority
 * @Author linbin
 * @Date 2019/11/21 15:23
 * @Description ：线程优先级的随机性--优先级高的一般先执行，而且优先执行完毕，线程执行的顺序和代码执行的顺序无关
 */
public class demo02_RandomPriority {
    public static void main(String[] args) {
        for (int m = 0 ; m < 5 ; m ++){
            Thread thread1 = new Thread(){
                @Override
                public void run() {
                    long beginTime = System.currentTimeMillis();
                    for (int i = 0 ; i < 1000000 ; i++){
                        Random random = new Random();
                        random.nextInt();
                    }
                    long endTime = System.currentTimeMillis();
                    System.out.println("★★★★★ thread1 用时 : " + (endTime - beginTime) + "毫秒");
                }
            };
            thread1.setPriority(10);

            Thread thread2 = new Thread(){
                @Override
                public void run() {
                    long beginTime = System.currentTimeMillis();
                    for (int i = 0 ; i < 1000000 ; i++){
                        Random random = new Random();
                        random.nextInt();
                    }
                    long endTime = System.currentTimeMillis();
                    System.out.println("✩✩✩✩✩ thread2 用时 : " + (endTime - beginTime) + "毫秒");
                }
            };
            thread2.setPriority(1);

            thread1.start();
            thread2.start();
        }
    }
}
