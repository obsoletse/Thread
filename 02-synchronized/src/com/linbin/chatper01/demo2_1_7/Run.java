package com.linbin.chatper01.demo2_1_7;

/**
 * @ClassName Run
 * @Author LinBin
 * @Date 2019/11/26 14:11
 * @Description ：出现异常释放锁,其他线程可以获得这个同步锁对象
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        Service service = new Service();
        ThreadA threadA = new ThreadA(service);
        ThreadB threadB = new ThreadB(service);
        threadA.setName("a");
        threadA.start();
        Thread.sleep(200);
        threadB.setName("b");
        threadB.start();
    }
}
