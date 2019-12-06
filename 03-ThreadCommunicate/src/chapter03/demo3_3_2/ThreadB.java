package chapter03.demo3_3_2;

/**
 * @ClassName ThreadA
 * @Author LinBin
 * @Date 2019/12/6 13:35
 * @Description :
 */
public class ThreadB extends Thread {
    @Override
    public void run() {
        super.run();
        try{
            for( int i = 0 ; i < 100 ; i ++){
                Tools.threadLocal.set(String.valueOf(i));
                System.out.println("ThreadB get i = " + Tools.threadLocal.get());
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
