package chapter01.demo3_1_11._2;

/**
 * @ClassName PThread
 * @Author LinBin
 * @Date 2019/12/5 11:13
 * @Description :
 */
public class PThread extends Thread {
    private P p;
    public PThread(P p){
        super();
        this.p = p;
    }

    @Override
    public void run() {
        while (true){
            p.setValue();
        }
    }
}
