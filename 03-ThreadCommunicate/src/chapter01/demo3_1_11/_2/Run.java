package chapter01.demo3_1_11._2;

/**
 * @ClassName Run
 * @Author LinBin
 * @Date 2019/12/5 11:15
 * @Description :
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        String lock = "";
        P p = new P(lock);
        C c = new C(lock);
        PThread[] pThreads = new PThread[2];
        CThread[] cThreads = new CThread[2];
        for (int i = 0 ; i < 2 ; i++){
            pThreads[i] = new PThread(p);
            pThreads[i].setName("生产者" + i);
            cThreads[i] = new CThread(c);
            cThreads[i].setName("消费者" + i);
            pThreads[i].start();
            cThreads[i].start();
        }
        Thread.sleep(5000);
        //获取当前项目所有活动的线程
        Thread[] threads = new Thread[Thread.currentThread().getThreadGroup().activeCount()];
        /*将活动的线程复制到指定的数组*/
        Thread.currentThread().getThreadGroup().enumerate(threads);
        for (int i = 0 ; i < threads.length ; i++){
            System.out.println(threads[i].getName() + " " + threads[i].getState());
        }
    }
}
