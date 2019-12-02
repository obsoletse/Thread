package chapter01.demo3_1_1;

/**
 * @ClassName Run
 * @Author LinBin
 * @Date 2019/12/2 9:39
 * @Description :
 */
public class Run {
    public static void main(String[] args) {
        MyList myList = new MyList();
        Thread threadA = new Thread(new ThreadA(myList),"A");
        Thread threadB = new Thread(new ThreadB(myList),"B");
        threadA.start();
        threadB.start();
    }
}
