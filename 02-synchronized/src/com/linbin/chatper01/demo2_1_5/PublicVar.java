package com.linbin.chatper01.demo2_1_5;

/**
 * @ClassName PublicVar
 * @Author linBin
 * @Date 2019/11/25 20:53
 * @Description ：脏读
 */
public class PublicVar {
    private String username = "A";
    private String password = "AA";
    synchronized public void setValue(String username , String password) throws InterruptedException {
        this.username = username;
        Thread.sleep(2000);
        this.password = password;
        System.out.println("setValue method thread name = " + Thread.currentThread().getName() + " username = " + username + " password = " + password);
    }

    synchronized public void getValue(){
        System.out.println("getValue method thread name = " + Thread.currentThread().getName() + " username = " + username + " password = " + password);

    }
}
