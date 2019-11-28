package com.linbin.chatper02.demo2_2_7._4;

/**
 * @ClassName MyService
 * @Author LinBin
 * @Date 2019/11/28 10:00
 * @Description :
 */
public class MyService {
    public MyList addMethod (MyList list , String data){
        try {
            synchronized (list){
                if (list.getListSize() < 1){
                    //TODO 模拟远程获取数据
                    Thread.sleep(2000);
                    list.add(data);
                }
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        return list;
    }
}
