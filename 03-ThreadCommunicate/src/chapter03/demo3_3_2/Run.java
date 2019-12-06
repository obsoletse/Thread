package chapter03.demo3_3_2;

/**
 * @ClassName Run
 * @Author LinBin
 * @Date 2019/12/6 13:37
 * @Description :
 */
public class Run {
    public static void main(String[] args) {
        ThreadA threadA = new ThreadA();
        ThreadB threadB = new ThreadB();
        threadA.start();
        threadB.start();
    }
}
