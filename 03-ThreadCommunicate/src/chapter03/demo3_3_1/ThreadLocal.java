package chapter03.demo3_3_1;

/**
 * @ClassName ThreadLocal
 * @Author LinBin
 * @Date 2019/12/6 13:22
 * @Description :
 */
public class ThreadLocal {
    public static java.lang.ThreadLocal t1 = new java.lang.ThreadLocal();

    public static void main(String[] args) {
        if (t1.get() == null){
            System.out.println("无值!");
            t1.set("我的值");
        }
        System.out.println(t1.get());
        System.out.println(t1.get());
    }
}
