package chapter01.demo3_1_6;

/**
 * @ClassName ThreadA
 * @Author LinBin
 * @Date 2019/12/2 14:19
 * @Description :
 */
public class ThreadA extends Thread {
    private Object lock;
    public ThreadA(Object lock){
        super();
        this.lock = lock;
    }

    @Override
    public void run() {
        super.run();
        Service service = new Service();
        try {
            service.method1(lock);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
