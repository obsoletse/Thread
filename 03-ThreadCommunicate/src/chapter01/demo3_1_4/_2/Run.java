package chapter01.demo3_1_4._2;

/**
 * @ClassName Run
 * @Author LinBin
 * @Date 2019/12/2 13:51
 * @Description :
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        Object object = new Object();
        ThreadA threadA = new ThreadA(object);
        ThreadB threadB = new ThreadB(object);
        threadA.start();
        Thread.sleep(1000);
        threadB.start();
    }
}
