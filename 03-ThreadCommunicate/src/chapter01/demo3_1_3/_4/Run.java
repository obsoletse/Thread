package chapter01.demo3_1_3._4;

/**
 * @ClassName Run
 * @Author LinBin
 * @Date 2019/12/2 9:39
 * @Description :
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        Object o = new Object();
        Thread threadA = new Thread(new ThreadA(o),"A");
        Thread threadB = new Thread(new ThreadB(o),"B");
        threadB.start();
        Thread.sleep(1000);
        threadA.start();
    }
}
