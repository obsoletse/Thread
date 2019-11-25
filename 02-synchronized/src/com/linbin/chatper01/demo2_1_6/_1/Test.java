package com.linbin.chatper01.demo2_1_6._1;

/**
 * @ClassName Test
 * @Author linBin
 * @Date 2019/11/25 21:22
 * @Description ：synchronize锁可重入
 */
public class Test {
    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                Service service = new Service();
                service.Service1();
            }
        });
        thread.start();
    }
}
