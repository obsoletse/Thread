package com.linbin.chatper02.demo2_2_1;

/**
 * @ClassName Run
 * @Author LinBin
 * @Date 2019/11/27 9:18
 * @Description :
 */
public class Run {
    public static void main(String[] args) {
        Task task = new Task();
        ThreadA threadA = new ThreadA(task);
        ThreadB threadB = new ThreadB(task);
        threadA.setName("A");
        threadB.setName("B");
        threadA.start();
        threadB.start();//注意顺序
        try {
            /*当前线程必须先休眠让threadA和threadB执行完才可以统计时间*/
            Thread.sleep(10000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        long beginTime = CommonUtils.beginTime1;
        if (CommonUtils.beginTime2 < CommonUtils.beginTime1){
            beginTime = CommonUtils.beginTime2;
        }
        long endTime = CommonUtils.endTime1;
        if (CommonUtils.endTime2 > CommonUtils.endTime1){
            endTime = CommonUtils.endTime2;
        }
        System.out.println("耗时:" + (endTime-beginTime)/1000 + "s");
    }
}
