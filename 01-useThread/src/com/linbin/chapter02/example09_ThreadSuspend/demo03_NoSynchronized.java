package com.linbin.chapter02.example09_ThreadSuspend;

/**
 * @ClassName demo03_NoSynchronized
 * @Author linbin
 * @Date 2019/11/21 13:33
 * @Description ：suspend线程不同步案例
 */
public class demo03_NoSynchronized {
    private String username = "1";
    private String password = "11";

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setValue(String username , String password){
        this.username = username;
        if (Thread.currentThread().getName().equals("a")){
            System.out.println("停止线程");
            Thread.currentThread().suspend();
        }
        this.password = password;
    }

    public void print(){
        System.out.println("username = " + this.getUsername() + ", password = " + this.getPassword() );
    }

    public static void main(String[] args) throws InterruptedException {
        demo03_NoSynchronized noSynchronized = new demo03_NoSynchronized();
        Thread thread1 = new Thread(){
            @Override
            public void run() {
                super.run();
                noSynchronized.setValue("a","aa");
            }
        };
        thread1.setName("a");
        thread1.start();
        Thread.sleep(1000);
        Thread thread2 = new Thread(){
            @Override
            public void run() {
                super.run();
                noSynchronized.print();
            }
        };
        thread2.start();
    }
}
