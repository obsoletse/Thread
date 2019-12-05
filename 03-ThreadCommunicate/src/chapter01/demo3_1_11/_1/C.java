package chapter01.demo3_1_11._1;

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
                    lock.wait();
                }
                System.out.println("get的值是: " + ValueObject.value);
                Thread.sleep(1000);
                ValueObject.value = "";
                lock.notify();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
