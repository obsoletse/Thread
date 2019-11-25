package com.linbin.chatper01.demo2_1_6._1;

/**
 * @ClassName Service
 * @Author linBin
 * @Date 2019/11/25 21:21
 * @Description ：
 */
public class Service {
    synchronized public void Service1(){
        System.out.println("Service1");
        Service2();
    }

    synchronized public void Service2(){
        System.out.println("Service2");
        Service3();
    }

    synchronized public void Service3(){
        System.out.println("Service3");
    }
}
