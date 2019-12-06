package chapter04.demo3_4_1;

/**
 * @ClassName Main
 * @Author LinBin
 * @Date 2019/12/6 14:26
 * @Description :
 */
public class Main {
    public static void main(String[] args) {
        try {
            for (int i = 0 ; i < 10 ; i ++){
                System.out.println("在Main中取值 = " + Tools.t.get());
                Thread.sleep(1000);
            }
            Thread.sleep(1000);
            ThreadA threadA = new ThreadA();
            threadA.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
