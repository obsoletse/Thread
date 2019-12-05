package chapter02.demo3_2_1;

/**
 * @ClassName MyThread
 * @Author LinBin
 * @Date 2019/12/5 15:16
 * @Description :
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        try {
            int second = (int)(Math.random()*1000);
            System.out.println(second);
            Thread.sleep(second);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
