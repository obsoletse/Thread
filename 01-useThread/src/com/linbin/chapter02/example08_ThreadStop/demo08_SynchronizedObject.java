package com.linbin.chapter02.example08_ThreadStop;

/**
 * @ClassName demo08_SynchronizedObject
 * @Author LinBin
 * @Date 2019/11/21 10:08
 * @Description :
 */
public class demo08_SynchronizedObject {
    private String username = "a";
    private String password = "aa";

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

    synchronized public void printString (String username , String password){
        try {
            this.username = username;
            Thread.sleep(100000);
            this.password = password;
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
