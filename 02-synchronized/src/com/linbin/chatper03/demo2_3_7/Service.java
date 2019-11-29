package com.linbin.chatper03.demo2_3_7;

/**
 * @ClassName Service
 * @Author LinBin
 * @Date 2019/11/29 15:01
 * @Description :
 */
public class Service {
    private boolean isContinueRun = true;
    public void runMethod(){

        while (isContinueRun == true){
                synchronized (this){
            }
        }
        System.out.println("停下来了!");
    }

    public void set(){
        isContinueRun = false;
    }
}
