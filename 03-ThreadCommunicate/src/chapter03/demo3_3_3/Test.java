package chapter03.demo3_3_3;

/**
 * @ClassName Test
 * @Author LinBin
 * @Date 2019/12/6 13:45
 * @Description :
 */
public class Test extends ThreadLocal{
    @Override
    protected Object initialValue() {
        return "陈二狗";
    }
}
