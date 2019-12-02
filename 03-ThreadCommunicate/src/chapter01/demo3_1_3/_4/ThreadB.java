package chapter01.demo3_1_3._4;

/**
 * @ClassName ThreadB
 * @Author LinBin
 * @Date 2019/12/2 9:37
 * @Description :
 */
public class ThreadB implements Runnable{
    private Object lock;
    public ThreadB(Object lock){
        this.lock = lock;
    }
    @Override
    public void run() {
        try{
            synchronized (lock){
                    if (MyList.getSize() != 5){
                        System.out.println("wait begin time = " + System.currentTimeMillis());
                        lock.wait();
                        System.out.println("wait end time = " + System.currentTimeMillis());
                    }
                    Thread.sleep(1000);
            }
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }
}
