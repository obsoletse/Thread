package com.linbin.chatper01.demo2_1_6._2;

/**
 * @ClassName Sub
 * @Author linBin
 * @Date 2019/11/25 21:36
 * @Description ：
 */
public class Sub extends Main {
    synchronized public void operateISubMethod(){
        try {
            while (i > 0){
                i--;
                System.out.println("Sub print i = " + i);
                Thread.sleep(100);
                this.operateMainIMethod();
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
