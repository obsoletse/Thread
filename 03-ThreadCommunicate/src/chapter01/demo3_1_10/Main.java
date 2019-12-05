package chapter01.demo3_1_10;

/**
 * @ClassName Main
 * @Author LinBin
 * @Date 2019/12/5 10:39
 * @Description :
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        String lock = new String("1");
        Add add = new Add(lock);
        Subtract subtract = new Subtract(lock);
        ThreadAdd threadAdd = new ThreadAdd(add);
        ThreadSubtract thread1Subtract = new ThreadSubtract(subtract);
        thread1Subtract.setName("thread1Subtract");
        thread1Subtract.start();
        ThreadSubtract thread2Subtract = new ThreadSubtract(subtract);
        thread2Subtract.setName("thread2Subtract");
        thread2Subtract.start();
        Thread.sleep(2000);
        threadAdd.setName("ThreadAdd");
        threadAdd.start();
    }
}
