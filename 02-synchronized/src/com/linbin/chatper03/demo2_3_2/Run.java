package com.linbin.chatper03.demo2_3_2;

/**
 * @ClassName Run
 * @Author LinBin
 * @Date 2019/11/29 9:26
 * @Description :
 */
public class Run {
    public static void main(String[] args) {
        PrintString printString = new PrintString();
        new Thread(printString).start();
        System.out.println("我要停止他! stop Thread name = " + Thread.currentThread().getName());
        printString.setContinuePrint(false);
    }
}
