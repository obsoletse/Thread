package chapter01.demo3_1_11._1;

/**
 * @ClassName PThread
 * @Author LinBin
 * @Date 2019/12/5 11:13
 * @Description :
 */
public class PThread extends Thread {
    private String lock;
    public PThread(String lock){
        super();
        this.lock = lock;
    }

    @Override
    public void run() {
        P p = new P(lock);
        while (true){
            p.setValue();
        }
    }
}
