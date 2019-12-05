package chapter02.demo3_2_5;

/**
 * @ClassName ThreadA
 * @Author LinBin
 * @Date 2019/12/5 16:03
 * @Description :
 */
public class ThreadA extends Thread{
    private ThreadB threadB;
    public ThreadA(ThreadB threadB){
        this.threadB = threadB;
    }

    @Override
    public void run() {
        try{
            synchronized (threadB){
                threadB.start();
                threadB.join();
                for (int i = 0 ; i < Integer.MAX_VALUE ; i++){
                    Math.random();
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
