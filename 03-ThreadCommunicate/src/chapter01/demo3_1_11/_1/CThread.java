package chapter01.demo3_1_11._1;

/**
 * @ClassName CThread
 * @Author LinBin
 * @Date 2019/12/5 11:14
 * @Description :
 */
public class CThread extends Thread {
    private String lock;
    public CThread(String lock){
        super();
        this.lock = lock;
    }

    @Override
    public void run() {
        super.run();
        C c = new C(lock);
        while (true){
            c.getValue();
        }
    }
}
