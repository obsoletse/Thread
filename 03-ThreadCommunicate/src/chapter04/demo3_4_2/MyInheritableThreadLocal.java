package chapter04.demo3_4_2;

import java.util.Date;

/**
 * @ClassName MyInheritableThreadLocal
 * @Author LinBin
 * @Date 2019/12/6 14:19
 * @Description :
 */
public class MyInheritableThreadLocal extends InheritableThreadLocal {
    @Override
    protected Object initialValue() {
        return new Date().getTime();
    }

    @Override
    protected Object childValue(Object parentValue) {
        return parentValue + "我在子线程中修改了";
    }
}
