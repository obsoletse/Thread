package chapter02.demo3_2_3;

/**
 * @ClassName ThreadB
 * @Author LinBin
 * @Date 2019/12/5 15:29
 * @Description :
 */
public class ThreadB extends Thread{
    @Override
    public void run() {
        try{
            ThreadA a = new ThreadA();
            a.start();
            a.join();
            System.out.println("在run end处打印");
        } catch (InterruptedException e) {
            System.out.println("在catch处打印");
        }
    }
}
