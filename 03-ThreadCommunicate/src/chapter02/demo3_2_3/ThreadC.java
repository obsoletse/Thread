package chapter02.demo3_2_3;

/**
 * @ClassName ThreadC
 * @Author LinBin
 * @Date 2019/12/5 15:30
 * @Description :
 */
public class ThreadC extends Thread{
    private ThreadB threadB;
    public ThreadC(ThreadB threadB){
        this.threadB = threadB;
    }
    @Override
    public void run() {
        super.run();
        threadB.interrupt();
    }
}
