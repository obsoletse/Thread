package chapter01.demo3_1_6;

/**
 * @ClassName Service
 * @Author LinBin
 * @Date 2019/12/2 14:20
 * @Description :
 */
public class Service {
    public void method1(Object lock) throws InterruptedException {
        synchronized (lock){
            System.out.println("线程" + Thread.currentThread().getName() + " begin wait");
            lock.wait();
            System.out.println("线程" + Thread.currentThread().getName() + " end wait");
        }
    }

    public void method2(Object lock) throws InterruptedException {
        synchronized (lock){
            System.out.println("线程" + Thread.currentThread().getName() + " begin notify");
            lock.notify();
            System.out.println("线程" + Thread.currentThread().getName() + " end notify");
        }
    }
}
