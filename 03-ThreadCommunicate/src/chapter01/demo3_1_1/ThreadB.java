package chapter01.demo3_1_1;

/**
 * @ClassName ThreadB
 * @Author LinBin
 * @Date 2019/12/2 9:37
 * @Description :
 */
public class ThreadB implements Runnable{
    volatile private MyList list;
    public ThreadB(MyList list){
        this.list = list;
    }
    @Override
    public void run() {
        try{
            while (true){
                if (list.getSize() == 5){
                    System.out.println("线程B要退出了!");
                    throw new InterruptedException();
                }
         /*       Thread.sleep(1000);*/
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
