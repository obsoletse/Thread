package chapter01.demo3_1_3._3;

/**
 * @ClassName Run
 * @Author LinBin
 * @Date 2019/12/2 10:52
 * @Description :
 */
public class Run {
    public static void main(String[] args) {
        MyObject object = new MyObject();
        ThreadA threadA = new ThreadA(object);
        ThreadB threadB = new ThreadB(object);
        threadA.start();
        threadB.start();
    }
}
