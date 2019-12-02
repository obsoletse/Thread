package chapter01.demo3_1_6;

/**
 * @ClassName ThreadB
 * @Author LinBin
 * @Date 2019/12/2 14:19
 * @Description :
 */
public class ThreadB extends Thread {
    private Object lock;
    public ThreadB(Object lock){
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
