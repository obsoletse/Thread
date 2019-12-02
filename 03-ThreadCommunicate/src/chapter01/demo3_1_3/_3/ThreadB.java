package chapter01.demo3_1_3._3;

/**
 * @ClassName ThreadB
 * @Author LinBin
 * @Date 2019/12/2 10:49
 * @Description :
 */
public class ThreadB extends Thread {
    private MyObject myObject;
    public ThreadB(MyObject myObject){
        super();
        this.myObject = myObject;
    }
    @Override
    public void run() {
        super.run();
        try {
            method();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void method() throws InterruptedException {
        synchronized (myObject){
            System.out.println("notify begin time = " + System.currentTimeMillis());
            myObject.notify();
            System.out.println("notify end time = " + System.currentTimeMillis());
        }
    }
}
