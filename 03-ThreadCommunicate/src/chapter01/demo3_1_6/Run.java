package chapter01.demo3_1_6;

/**
 * @ClassName Run
 * @Author LinBin
 * @Date 2019/12/2 14:24
 * @Description :
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        Object lock = new Object();
        ThreadA threadA = new ThreadA(lock);
        ThreadB threadB = new ThreadB(lock);
        ThreadC threadC = new ThreadC(lock);
        threadA.start();
        threadB.start();
        threadC.start();
        Thread.sleep(2000);
        NotifyThread thread = new NotifyThread(lock);
        thread.start();
    }
}
