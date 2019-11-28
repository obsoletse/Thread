package com.linbin.chatper03.demo2_3_1;

/**
 * @ClassName Run
 * @Author LinBin
 * @Date 2019/11/28 15:47
 * @Description :
 */
public class Run {
    public static void main(String[] args) {
        PrintString printString = new PrintString();
        printString.printMethod();
        System.out.println("我要停止它!");
        printString.setContinuePrint(false);
    }
}
