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
    public Subtract(String lock){
        this.lock = lock;
    }

    public void subtract() throws InterruptedException {
        synchronized (lock){
            if (ValueObject.list.size() == 0){
                System.out.println("wait begin ThreadName = " + Thread.currentThread().getName());
                lock.wait();
                System.out.println("wait end ThreadName = " + Thread.currentThread().getName());
            }
            ValueObject.list.remove(0);
            System.out.println("list size = " + ValueObject.list.size());
        }
    }
}
