package chapter01.demo3_1_14;

/**
 * @ClassName BackUpA
 * @Author LinBin
 * @Date 2019/12/5 15:05
 * @Description :
 */
public class BackUpA extends Thread {
    private DBTools dbTools;
    public BackUpA(DBTools dbTools){
        super();
        this.dbTools = dbTools;
    }

    @Override
    public void run() {
        super.run();
        dbTools.backUpA();
    }
}
