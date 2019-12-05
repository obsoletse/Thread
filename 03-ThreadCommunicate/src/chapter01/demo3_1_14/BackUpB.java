package chapter01.demo3_1_14;

/**
 * @ClassName BackUpB
 * @Author LinBin
 * @Date 2019/12/5 15:05
 * @Description :
 */
public class BackUpB extends Thread {
    private DBTools dbTools;
    public BackUpB(DBTools dbTools){
        super();
        this.dbTools = dbTools;
    }

    @Override
    public void run() {
        super.run();
        dbTools.backUpB();
    }
}
