package chapter02.demo3_2_5;

/**
 * @ClassName Run
 * @Author LinBin
 * @Date 2019/12/5 16:09
 * @Description :
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        ThreadB threadB = new ThreadB();
        ThreadA threadA = new ThreadA(threadB);
        threadA.start();
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                threadB.method();
            }
        });
        Thread.sleep(1000);
        thread.start();
    }
}
