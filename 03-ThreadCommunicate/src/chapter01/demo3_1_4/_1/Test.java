package chapter01.demo3_1_4._1;

/**
 * @ClassName Test
 * @Author LinBin
 * @Date 2019/12/2 13:53
 * @Description :
 */
public class Test {
    public void testMethod(Object lock){
        try {
            synchronized (lock){
                System.out.println("线程 " + Thread.currentThread().getName() + " 进入testMethod了!");
                lock.wait();
                System.out.println("线程 " + Thread.currentThread().getName() + " 离开testMethod了!");
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
