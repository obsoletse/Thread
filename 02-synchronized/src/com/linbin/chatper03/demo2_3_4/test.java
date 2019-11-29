package com.linbin.chatper03.demo2_3_4;

/**
 * @ClassName test
 * @Author LinBin
 * @Date 2019/11/29 11:06
 * @Description :
 */
public class test {
    public static void main(String[] args) {
        VolatileThread[] volatileThreads = new VolatileThread[100];
        for (int i = 0 ; i < 100 ; i++){
            volatileThreads[i] = new VolatileThread();
        }
        for (int i = 0 ; i < 100 ; i++){
            volatileThreads[i].start();
        }
    }
}
