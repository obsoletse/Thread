package chapter04.demo3_4_2;

/**
 * @ClassName ThreadA
 * @Author LinBin
 * @Date 2019/12/6 14:20
 * @Description :
 */
public class ThreadA extends Thread {
    @Override
    public void run() {
        super.run();
        try {
            for (int i = 0 ; i < 10 ; i ++){
                System.out.println("在ThreadA中取值 = " + Tools.t.get());
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
