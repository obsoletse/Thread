package chapter01.demo3_1_14;

/**
 * @ClassName Run
 * @Author LinBin
 * @Date 2019/12/5 15:06
 * @Description :
 */
public class Run {
    public static void main(String[] args) {
        DBTools dbTools = new DBTools();
        for (int i = 0 ; i < 20 ; i++){
            BackUpA backUpA = new BackUpA(dbTools);
            BackUpB backUpB = new BackUpB(dbTools);
            backUpA.start();
            backUpB.start();
        }
    }
}
