package com.linbin.chatper01.demo2_1_3;

/**
 * @ClassName HasSafePrivateNum
 * @Author linbin
 * @Date 2019/11/21 16:45
 * @Description ：实例变量的非线程安全
 */
public class HasSafePrivateNum {
    private int num = 0;
    synchronized  public void addI(String username){
        try {
            if (username.equals("a")){
                num = 100;
                System.out.println("a set over!");
                Thread.sleep(2000);
            }else {
                num = 200;
                System.out.println("b set over!");
            }
            System.out.println(username + " num = " + num);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
