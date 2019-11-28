package com.linbin.chatper02.demo2_2_7._4;

/**
 * @ClassName Run
 * @Author LinBin
 * @Date 2019/11/28 10:07
 * @Description :
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        MyList list = new MyList();
        ThreadA threadA = new ThreadA(list);
        ThreadB threadB = new ThreadB(list);
        threadA.start();
        threadB.start();
        Thread.sleep(5000);
        System.out.println("listSize = " + list.getListSize());
    }
}
