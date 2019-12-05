package chapter02.demo3_2_5;

/**
 * @ClassName ThreadB
 * @Author LinBin
 * @Date 2019/12/5 16:03
 * @Description :
 */
public class ThreadB extends Thread {
    synchronized public void method(){
        System.out.println("b 打印服务 time = " + System.currentTimeMillis());
    }
    @Override
    public void run() {
        try{
            System.out.println("b begin time = " + System.currentTimeMillis());
            Thread.sleep(6000);
            System.out.println("b end time = " + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
