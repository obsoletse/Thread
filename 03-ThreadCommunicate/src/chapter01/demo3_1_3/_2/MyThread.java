package chapter01.demo3_1_3._2;

/**
 * @ClassName MyThread
 * @Author LinBin
 * @Date 2019/12/2 10:49
 * @Description :
 */
public class MyThread extends Thread {
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
        String lock = new String(" ");
        System.out.println("在synchronized上面");
        synchronized (lock){
            System.out.println("wait begin time = " + System.currentTimeMillis());
            lock.wait();
            System.out.println("wait end time = " + System.currentTimeMillis());
        }
    }
}
