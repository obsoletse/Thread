package chapter01.demo3_1_11._2;

/**
 * @ClassName CThread
 * @Author LinBin
 * @Date 2019/12/5 11:14
 * @Description :
 */
public class CThread extends Thread {
    private C c;
    public CThread(C c){
        super();
        this.c = c;
    }

    @Override
    public void run() {
        super.run();
        while (true){
            c.getValue();
        }
    }
}
