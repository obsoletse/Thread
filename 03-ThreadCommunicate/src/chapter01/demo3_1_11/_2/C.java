package chapter01.demo3_1_11._2;

/**
 * @ClassName C
 * @Author LinBin
 * @Date 2019/12/5 11:10
 * @Description : 消费者
 */
public class C {
    private String lock;
    public C(String lock){
        super();
        this.lock = lock;
    }

    public void getValue(){
        try {
            synchronized (lock){
                if (ValueObject.value.equals("")){
                    System.out.println(Thread.currentThread().getName() + "waiting了✩");
                    lock.wait();
                }
                System.out.println(Thread.currentThread().getName() + "开始Run了");
                ValueObject.value = "";
                lock.notify();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
