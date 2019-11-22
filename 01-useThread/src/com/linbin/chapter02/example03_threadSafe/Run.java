package com.linbin.chapter02.example03_threadSafe;

public class Run {
    public static void main(String[] args) {
        ALogin threadA = new ALogin();
        BLogin threadB = new BLogin();
        threadA.start();
        threadB.start();
    }
}
