package com.linbin.chatper01.demo2_1_8;

/**
 * @ClassName Sub
 * @Author LinBin
 * @Date 2019/11/26 15:00
 * @Description ：
 */
public class Sub extends Main {
    @Override
    public void method() {
        try {
            System.out.println("in Sub 下一步操作为sleep,当前线程 = " + Thread.currentThread().getName() + " ,begin time = " + System.currentTimeMillis());
            Thread.sleep(3000);
            System.out.println("in Sub sleep操作完成,当前线程 = " + Thread.currentThread().getName() + " ,end time = " + System.currentTimeMillis());
            super.method();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
