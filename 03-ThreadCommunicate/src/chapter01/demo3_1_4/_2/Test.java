package chapter01.demo3_1_4._2;

/**
 * @ClassName Test
 * @Author LinBin
 * @Date 2019/12/2 13:53
 * @Description :
 */
public class Test {
    public void testMethod1(Object lock){
        try {
            synchronized (lock){
                System.out.println("线程 " + Thread.currentThread().getName() + " 进入testMethod了1!");
                System.out.println("线程 " + Thread.currentThread().getName() + " 开始wait!");
                lock.wait();
                System.out.println("线程 " + Thread.currentThread().getName() + " wait结束了!");
                System.out.println("线程 " + Thread.currentThread().getName() + " 离开testMethod1了!");
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    public void testMethod2(Object lock){
        synchronized (lock){
            System.out.println("线程 " + Thread.currentThread().getName() + " 进入testMethod2了!");
            System.out.println("线程 " + Thread.currentThread().getName() + " 开始执行任务!");
            lock.notify();
            System.out.println("线程 " + Thread.currentThread().getName() + " 已经发出通知了");
            System.out.println("线程 " + Thread.currentThread().getName() + " 离开testMethod2了!");
        }
    }
}
