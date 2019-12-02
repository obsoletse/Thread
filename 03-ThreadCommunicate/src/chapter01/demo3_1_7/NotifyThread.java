package chapter01.demo3_1_7;

/**
 * @ClassName NotifyThread
 * @Author LinBin
 * @Date 2019/12/2 14:23
 * @Description :
 */
public class NotifyThread extends Thread {
    private Object lock;
    public NotifyThread(Object lock){
        super();
        this.lock = lock;
    }

    @Override
    public void run() {
        super.run();
        Service service = new Service();
        try {
            service.method2(lock);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
