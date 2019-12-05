package chapter01.demo3_1_10;


import java.util.List;

/**
 * @ClassName Add
 * @Author LinBin
 * @Date 2019/12/2 15:54
 * @Description :
 */
public class Add {
    private String lock;
    public Add(String lock){
        this.lock = lock;
    }

    public void add(){
        synchronized (lock){
            ValueObject.list.add("anyString");
            lock.notifyAll();
        }
    }
}
