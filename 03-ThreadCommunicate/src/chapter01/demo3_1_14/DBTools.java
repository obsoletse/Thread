package chapter01.demo3_1_14;

/**
 * @ClassName BackUpA
 * @Author LinBin
 * @Date 2019/12/5 15:01
 * @Description :
 */
public class DBTools {
    volatile private boolean prevIsA = false;
    synchronized public void backUpA(){
        try {
            while (prevIsA == true){
                wait();
            }
            System.out.println("★★★★★");
            prevIsA = true;
            notifyAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    synchronized public void backUpB(){
        try {
            while (prevIsA == false){
                wait();
            }
            System.out.println("✩✩✩✩✩");
            prevIsA = false;
            notifyAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
