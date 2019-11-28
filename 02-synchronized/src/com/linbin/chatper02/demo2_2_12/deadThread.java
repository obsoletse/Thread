package com.linbin.chatper02.demo2_2_12;

/**
 * @ClassName deadThread
 * @Author LinBin
 * @Date 2019/11/28 13:51
 * @Description :
 */
public class deadThread implements Runnable{
    private String username;
    public Object lock1 = new Object();
    public Object lock2 = new Object();
    public void setFlag(String username){
        this.username = username;
    }
    @Override
    public void run() {
        if (username.equals("a")){
            synchronized (lock1){
                try {
                    System.out.println("username = " + username);
                    Thread.sleep(3000);
                }catch (InterruptedException e){
                    //TODO 处理异常
                    e.printStackTrace();
                }
                synchronized (lock2){
                    System.out.println("按照lock1->lock2的顺序执行");
                }
            }
        }
        else if (username.equals("b")){
            synchronized (lock2){
                try {
                    System.out.println("username = " + username);
                    Thread.sleep(3000);
                }catch (InterruptedException e){
                    //TODO 处理异常
                    e.printStackTrace();
                }
                synchronized (lock1){
                    System.out.println("按照lock2->lock1的顺序执行");
                }
            }
        }
    }
}
