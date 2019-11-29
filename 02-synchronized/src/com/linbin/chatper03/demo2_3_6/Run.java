package com.linbin.chatper03.demo2_3_6;

/**
 * @ClassName Run
 * @Author LinBin
 * @Date 2019/11/29 14:55
 * @Description :
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        MyService service = new MyService();
        ThreadA threadA = new ThreadA(service);
        ThreadB threadB = new ThreadB(service);
        threadA.setName("A");
        threadB.setName("B");
        threadA.start();
        Thread.sleep(2000);
        threadB.start();
        System.out.println(service.aiRef.get());
    }
}
