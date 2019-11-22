package com.linbin.chapter02.example03_threadSafe;

public class BLogin extends Thread{
    @Override
    public void run() {
        LoginServlet.doPost("b","bb");
    }
}
