package chapter01.demo3_1_3._3;

/**
 * @ClassName ThreadA
 * @Author LinBin
 * @Date 2019/12/2 10:49
 * @Description :
 */
public class ThreadA extends Thread {
    private MyObject myObject;
    public ThreadA(MyObject myObject){
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
            System.out.println("wait begin time = " + System.currentTimeMillis());
            myObject.wait();
            System.out.println("wait end time = " + System.currentTimeMillis());
        }
    }
}
