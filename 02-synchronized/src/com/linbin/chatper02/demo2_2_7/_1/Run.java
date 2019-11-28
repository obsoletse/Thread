package com.linbin.chatper02.demo2_2_7._1;

/**
 * @ClassName Run
 * @Author LinBin
 * @Date 2019/11/27 13:21
 * @Description : synchronized 代码块之间的同步性验证
 */
public class Run {
    public static void main(String[] args) {
        Service service = new Service();
        Thread threadA = new Thread(new ThreadA(service),"A");
        Thread threadB = new Thread(new ThreadB(service),"B");
        threadA.start();
        threadB.start();
    }
}
