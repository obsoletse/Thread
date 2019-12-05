package chapter01.demo3_1_10;

/**
 * @ClassName ThreadSubtract
 * @Author LinBin
 * @Date 2019/12/5 10:36
 * @Description :
 */
public class ThreadSubtract extends Thread {
    private Subtract s;
    public ThreadSubtract(Subtract s){
        this.s = s;
    }

    @Override
    public void run() {
        super.run();
        try {
            s.subtract();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
