package com.linbin.chatper02.demo2_2_1;

/**
 * @ClassName Task
 * @Author LinBin
 * @Date 2019/11/27 9:09
 * @Description : synchronized 声明方法耗时测试
 */
public class Task {
    private String getData1;
    private String getData2;
    public synchronized void method(){
        try{
            System.out.println("begin task");
            //TODO 处理任务
            Thread.sleep(3000);
            getData1 = "长时间处理任务后返回值1 threadName = " + Thread.currentThread().getName();
            getData2 = "长时间处理任务后返回值2 threadName = " + Thread.currentThread().getName();
            System.out.println(getData1);
            System.out.println(getData2);
            System.out.println("end task");
        }catch (InterruptedException e){
            //TODO 处理异常
            e.printStackTrace();
        }
    }
}
