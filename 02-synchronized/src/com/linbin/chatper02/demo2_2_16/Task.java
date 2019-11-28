package com.linbin.chatper02.demo2_2_16;

/**
 * @ClassName Task
 * @Author LinBin
 * @Date 2019/11/28 15:16
 * @Description :
 */
public class Task {
    private String lock = "123";
    public void testMethod(){
        synchronized (lock){
            try{
                System.out.println("Thread " + Thread.currentThread().getName() + " begin at" + System.currentTimeMillis() + " LOCK" + lock);
                lock = "456";
                Thread.sleep(2000);
                System.out.println("Thread " + Thread.currentThread().getName() + " end at" + System.currentTimeMillis());
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
