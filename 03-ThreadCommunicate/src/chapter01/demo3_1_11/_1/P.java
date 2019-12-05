package chapter01.demo3_1_11._1;

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
                    lock.wait();
                }
                String value = System.currentTimeMillis() + "_" + System.nanoTime();
                System.out.println("set的值是: " + value);
                Thread.sleep(1000);
                ValueObject.value = value;
                lock.notify();
            }
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
