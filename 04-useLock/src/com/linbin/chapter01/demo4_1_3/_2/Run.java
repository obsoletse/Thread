package com.linbin.chapter01.demo4_1_3._2;

/**
 * @ClassName Run
 * @Author LinBin
 * @Date 2019/12/10 13:14
 * @Description :
 */
public class Run {
    public static void main(String[] args) {
        MyService service = new MyService();
        Thread thread = new Thread(new MyThread(service),"a");
        thread.start();
    }
}
