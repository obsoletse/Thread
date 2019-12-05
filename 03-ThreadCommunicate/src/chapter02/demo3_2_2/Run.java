package chapter02.demo3_2_2;

/**
 * @ClassName Run
 * @Author LinBin
 * @Date 2019/12/5 15:18
 * @Description :
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        MyThread thread = new MyThread();
        thread.start();
        thread.join();
        //Thread.sleep(?)
        System.out.println("我做到了");
    }
}
