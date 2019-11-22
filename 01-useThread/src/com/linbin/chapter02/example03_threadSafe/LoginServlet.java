package com.linbin.chapter02.example03_threadSafe;

public class LoginServlet {
    private String username;
    private String password;
    synchronized public static void doPost(String username , String password){
        try {
            username = username;
            if (username.equals("a")){
                Thread.sleep(5000);
            }
            password = password;
            System.out.println("username = " + username + " , password = " + password);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
