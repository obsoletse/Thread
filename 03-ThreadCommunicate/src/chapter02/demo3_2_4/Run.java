package chapter02.demo3_2_4;

/**
 * @ClassName Run
 * @Author LinBin
 * @Date 2019/12/5 15:35
 * @Description :
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        MyThread myThread = new MyThread();
        myThread.start();
        myThread.join(2000);
        System.out.println("join end time = " + System.currentTimeMillis());
    }
}
