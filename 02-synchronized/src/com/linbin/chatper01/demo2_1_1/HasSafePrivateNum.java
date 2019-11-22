package com.linbin.chatper01.demo2_1_1;

/**
 * @ClassName HasSafePrivateNum
 * @Author linbin
 * @Date 2019/11/21 16:45
 * @Description ：线程方法内的变量线程安全
 */
public class HasSafePrivateNum {
    public void addI(String username){
        try {
            int num = 0;
            if (username.equals("a")){
                num = 100;
                System.out.println("a set over!");
                Thread.sleep(1000);
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
