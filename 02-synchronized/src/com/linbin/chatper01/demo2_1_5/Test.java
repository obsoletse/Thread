package com.linbin.chatper01.demo2_1_5;

/**
 * @ClassName Test
 * @Author linBin
 * @Date 2019/11/25 21:00
 * @Description ：数据脏读demo
 */
public class Test {
    public static void main(String[] args) throws InterruptedException {
        PublicVar publicVar = new PublicVar();
        ThreadA threadA = new ThreadA(publicVar);
        threadA.start();
        threadA.sleep(300);//休眠时间较少先运行getValue，出现脏读
        publicVar.getValue();
    }
}
