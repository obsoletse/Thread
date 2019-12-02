package chapter01.demo3_1_3._4;

/**
 * @ClassName ThreadCommunity
 * @Author LinBin
 * @Date 2019/12/2 9:28
 * @Description :
 */
public class ThreadA implements Runnable{
    private Object lock;
    public ThreadA(Object lock){
        this.lock = lock;
    }
    @Override
    public void run() {
        try {
            synchronized (lock){
                for (int i = 0 ; i < 10 ; i++){
                    MyList.add();
                    if (MyList.getSize() == 5){
                        System.out.println("已经发出通知!");
                        lock.notify();
                    }
                    System.out.println("添加了" + (i + 1) + "个元素");
                    Thread.sleep(1000);
                }
            }
        }catch (InterruptedException e){
            //TODO handle exception
            e.printStackTrace();
        }
    }
}
