package com.linbin.chatper02.demo2_2_7._1;

/**
 * @ClassName Service
 * @Author LinBin
 * @Date 2019/11/28 8:59
 * @Description :
 */
public class Service {

    private String username;
    private String password;
    private String anyString = new String();

    public void setUsernamePassword(String username , String password){
        try{
            synchronized (anyString){
                System.out.println("线程" + Thread.currentThread().getName() + "在" + System.currentTimeMillis() + "进入同步块");
                this.username = username;
                //TODO 处理任务
                Thread.sleep(3000);
                this.password = password;
                System.out.println("线程" + Thread.currentThread().getName() + "在" + System.currentTimeMillis() + "离开同步块");
            }
        }catch (InterruptedException e){
            //TODO 处理中断异常
            e.printStackTrace();
        }
    }
}
