package chapter02.demo3_2_3;

/**
 * @ClassName Run
 * @Author LinBin
 * @Date 2019/12/5 15:32
 * @Description :
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        ThreadB threadB = new ThreadB();
        threadB.start();
        Thread.sleep(2000);
        ThreadC threadC = new ThreadC(threadB);
        threadC.start();
    }
}
