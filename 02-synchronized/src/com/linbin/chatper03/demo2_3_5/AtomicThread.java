package com.linbin.chatper03.demo2_3_5;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @ClassName AtomicThread
 * @Author LinBin
 * @Date 2019/11/29 13:22
 * @Description : 验证原子操作线程安全.原子操作时不可分割的，没有线程能够中断正在运行的原子变量
 */
public class AtomicThread extends Thread{
    /*括号中为初始值*/
    private AtomicInteger count = new AtomicInteger(0);

    @Override
    public void run() {
        for (int i = 0 ; i < 10000 ; i ++){
            System.out.println(count.incrementAndGet());
        }
    }
}
