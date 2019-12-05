package chapter02.demo3_2_3;

/**
 * @ClassName ThreadA
 * @Author LinBin
 * @Date 2019/12/5 15:28
 * @Description :
 */
public class ThreadA extends Thread{
    @Override
    public void run() {
        for(int i = 0; i < Integer.MAX_VALUE ; i++){
            Math.random();
        }
    }
}
