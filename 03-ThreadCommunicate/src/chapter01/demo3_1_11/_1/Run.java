package chapter01.demo3_1_11._1;

/**
 * @ClassName Run
 * @Author LinBin
 * @Date 2019/12/5 11:15
 * @Description :
 */
public class Run {
    public static void main(String[] args) {
        String lock = "";
        PThread pThread = new PThread(lock);
        CThread cThread = new CThread(lock);
        pThread.start();
        cThread.start();
    }
}
