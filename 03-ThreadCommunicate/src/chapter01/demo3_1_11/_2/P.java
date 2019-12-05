package chapter01.demo3_1_11._2;

/**
 * @ClassName P
 * @Author LinBin
 * @Date 2019/12/5 11:05
 * @Description : 生产者
 */
public class P {
    private String lock;
    public P(String lock){
        super();
        this.lock = lock;
    }

    public void setValue(){
        try{
            synchronized (lock){
                if (!ValueObject.value.equals("")){
                    System.out.println(Thread.currentThread().getName() + "waiting了★");
                    lock.wait();
                }
                System.out.println(Thread.currentThread().getName() + "开始Run了");
                String value = System.currentTimeMillis() + "_" + System.nanoTime();
                ValueObject.value = value;
                lock.notify();
            }
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
