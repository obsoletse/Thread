package chapter01.demo3_1_3._1;

/**
 * @ClassName Main
 * @Author LinBin
 * @Date 2019/12/2 10:44
 * @Description : 未加锁或者放在同步代码块会出现IllegalMonitorStateException异常
 */
public class Main {
    public static void main(String[] args) {
        try{
            String newString = new String(" ");
            newString.wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
