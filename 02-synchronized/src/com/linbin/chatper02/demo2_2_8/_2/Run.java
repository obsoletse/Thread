package com.linbin.chatper02.demo2_2_8._2;

/**
 * @ClassName Run
 * @Author LinBin
 * @Date 2019/11/28 10:47
 * @Description :
 */
public class Run {
    public static void main(String[] args) {
        MyObject object = new MyObject();
        TheadA theadA = new TheadA(object);
        TheadB theadB = new TheadB(object);
        theadA.start();
        theadB.start();
    }
}
