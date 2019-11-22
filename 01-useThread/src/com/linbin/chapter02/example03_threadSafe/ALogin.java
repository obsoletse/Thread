package com.linbin.chapter02.example03_threadSafe;

public class ALogin extends Thread {
    @Override
    public void run() {
        LoginServlet.doPost("a","aa");
    }
}
