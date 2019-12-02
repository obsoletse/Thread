package chapter01.demo3_1_4._1;

/**
 * @ClassName ThreadA
 * @Author LinBin
 * @Date 2019/12/2 13:46
 * @Description :
 */
public class ThreadA extends Thread {
    private Object object;
    public ThreadA(Object o){
        this.object = o;
    }
    @Override
    public void run() {
        super.run();
        Test test = new Test();
        test.testMethod(object);
    }
}
