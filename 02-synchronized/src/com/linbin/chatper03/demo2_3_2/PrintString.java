package com.linbin.chatper03.demo2_3_2;

/**
 * @ClassName PrintString
 * @Author LinBin
 * @Date 2019/11/28 15:45
 * @Description :
 */
public class PrintString implements Runnable{

    private boolean isContinuePrint = true;

    public boolean isContinuePrint() {
        return isContinuePrint;
    }

    public void setContinuePrint(boolean continuePrint) {
        isContinuePrint = continuePrint;
    }

    public void printMethod(){
        try {
            while (isContinuePrint == true){
                System.out.println("run thread name = " + Thread.currentThread().getName());
                Thread.sleep(1000);
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        printMethod();
    }
}
