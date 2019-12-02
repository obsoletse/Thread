package chapter01.demo3_1_10;


import com.sun.beans.decoder.ValueObject;

import java.util.List;

/**
 * @ClassName Add
 * @Author LinBin
 * @Date 2019/12/2 15:54
 * @Description :
 */
public class Add {
    private String lock;
    private List<String> list;
    public Add(String lock, List<String> list){
        this.list = list;
        this.lock = lock;
    }

    public void add(){
        synchronized (lock){
            list.add("anyString");
            lock.notifyAll();
        }
    }
}
