package com.linbin.chatper01.demo2_1_6._2;

/**
 * @ClassName Main
 * @Author linBin
 * @Date 2019/11/25 21:34
 * @Description ：
 */
public class Main {
    protected int i = 10;
    synchronized public void operateMainIMethod(){
        try {
            while (i > 0){
                i--;
                System.out.println("Main print i = " + i);
                Thread.sleep(200);
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
