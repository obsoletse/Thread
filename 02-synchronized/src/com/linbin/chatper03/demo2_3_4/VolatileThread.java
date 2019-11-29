package com.linbin.chatper03.demo2_3_4;

/**
 * @ClassName VolatileThread
 * @Author LinBin
 * @Date 2019/11/29 11:01
 * @Description :   验证volatile非原子性
 */
public class VolatileThread extends Thread {
    volatile private static Integer count = 0;
    //注意要加static，此时锁对象为类锁，达到同步
    private void addCount(){
        synchronized (VolatileThread.class){
            for (int i = 0 ; i < 1000 ; i++){
                count++;
            }
            System.out.println("count = " + count);
        }
    }

    /*或者*/
    /*synchronized private static void addCount(){
        for (int i = 0 ; i < 1000 ; i++){
            count++;
        }
        System.out.println("count = " + count);
    }*/
    @Override
    public void run() {
        addCount();
    }
}
