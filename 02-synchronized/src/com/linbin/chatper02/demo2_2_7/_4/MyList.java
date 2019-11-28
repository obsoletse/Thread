package com.linbin.chatper02.demo2_2_7._4;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName MyList
 * @Author LinBin
 * @Date 2019/11/28 9:59
 * @Description :
 */
public class MyList {
    private List list = new ArrayList();
    synchronized public void add(String data){
        list.add(data);
    }

    synchronized  public int getListSize(){
        return list.size();
    }
}
