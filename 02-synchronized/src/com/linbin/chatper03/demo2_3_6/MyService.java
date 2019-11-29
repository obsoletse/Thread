package com.linbin.chatper03.demo2_3_6;

import java.util.concurrent.atomic.AtomicLong;

/**
 * @ClassName MyService
 * @Author LinBin
 * @Date 2019/11/29 14:52
 * @Description :
 */
public class MyService {
    public static AtomicLong aiRef = new AtomicLong();
    public void addNum(){
        System.out.println(Thread.currentThread().getName() + " + 了100之后的值是: " + aiRef.addAndGet(100));
        aiRef.addAndGet(1);
    }
}
