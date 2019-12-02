package chapter01.demo3_1_5;

/**
 * @ClassName Run
 * @Author LinBin
 * @Date 2019/12/2 14:10
 * @Description :
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        Object lock = new Object();
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (lock){
                    System.out.println("begin wait");
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("end wait");
                }
            }
        });

        thread.start();
        Thread.sleep(2000);
        thread.interrupt();
    }
}
