package chapter01.demo3_1_8;

/**
 * @ClassName Run
 * @Author LinBin
 * @Date 2019/12/2 15:17
 * @Description :
 */
public class Run {
    public static void main(String[] args) {
        Object lock = new Object();
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (lock){
                    System.out.println("wait begin time = " + System.currentTimeMillis());
                    try {
                        lock.wait(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("wait end time = " + System.currentTimeMillis());
                }
            }
        });

        thread.start();
    }
}
