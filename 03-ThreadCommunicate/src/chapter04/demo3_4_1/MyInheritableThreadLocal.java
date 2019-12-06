package chapter04.demo3_4_1;

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
}
