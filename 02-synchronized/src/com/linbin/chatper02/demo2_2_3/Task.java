package com.linbin.chatper02.demo2_2_3;

/**
 * @ClassName Task
 * @Author LinBin
 * @Date 2019/11/27 9:09
 * @Description : synchronized 声明方法耗时测试
 */
public class Task {
    private String getData1;
    private String getData2;
    public void method(){
        try{
            System.out.println("begin task threadName = " + Thread.currentThread().getName());
            //TODO 处理任务
            Thread.sleep(3000);
            synchronized (this){
                getData1 = "长时间处理任务后返回值1 threadName = " + Thread.currentThread().getName();
                getData2 = "长时间处理任务后返回值2 threadName = " + Thread.currentThread().getName();
            }
            System.out.println(getData1);
            System.out.println(getData2);
            System.out.println("end task threadName = " + Thread.currentThread().getName());
        }catch (InterruptedException e){
            //TODO 处理异常
            e.printStackTrace();
        }
    }
}
