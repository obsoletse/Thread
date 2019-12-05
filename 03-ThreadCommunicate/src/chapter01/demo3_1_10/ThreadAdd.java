package chapter01.demo3_1_10;

/**
 * @ClassName ThreadAdd
 * @Author LinBin
 * @Date 2019/12/5 10:35
 * @Description :
 */
public class ThreadAdd extends Thread {
    private Add add;
    public ThreadAdd(Add add){
        this.add = add;
    }

    @Override
    public void run() {
        add.add();
    }
}
