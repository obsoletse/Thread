package chapter02.demo3_2_1;

/**
 * @ClassName Run
 * @Author LinBin
 * @Date 2019/12/5 15:18
 * @Description :
 */
public class Run {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();
        //Thread.sleep(?)
        System.out.println("我想上面的线程执行完了在执行,但是应该休眠多长时间呢?");
    }
}
