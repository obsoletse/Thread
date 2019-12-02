package chapter01.demo3_1_10;

import java.util.List;

/**
 * @ClassName Subtract
 * @Author LinBin
 * @Date 2019/12/2 16:02
 * @Description :
 */
public class Subtract {
    private String lock;
    private List<String> list;
    public Subtract(String lock , List<String> list){
        this.list = list;
        this.lock = lock;
    }

    public void subtract() throws InterruptedException {
        synchronized (lock){
            if (list.size() == 0){
                System.out.println("wait begin ThreadName = " + Thread.currentThread().getName());
                lock.wait();
                System.out.println("wait end ThreadName = " + Thread.currentThread().getName());
            }
        }
    }
}
