package com.linbin.chapter01.demo4_1_12._1;

/**
 * @ClassName Run
 * @Author LinBin
 * @Date 2019/12/13 9:13
 * @Description :
 */
public class Run {
    public static void main(String[] args) {
        boolean isFair = true;
        Service service = new Service(true);
        Runnable runnable = () -> service.method();
        Thread thread = new Thread(runnable,"thread");
        thread.start();
    }
}
