package chapter01.demo3_1_4._1;

/**
 * @ClassName ThreadB
 * @Author LinBin
 * @Date 2019/12/2 13:49
 * @Description :
 */
public class ThreadB extends Thread {
    private Object object;
    public ThreadB(Object o){
        this.object = o;
    }
    @Override
    public void run() {
        super.run();
        Test test = new Test();
        test.testMethod(object);
    }
}
