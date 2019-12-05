package chapter02.demo3_2_4;

/**
 * @ClassName MyThread
 * @Author LinBin
 * @Date 2019/12/5 15:35
 * @Description :
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("begin time = " + System.currentTimeMillis());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
