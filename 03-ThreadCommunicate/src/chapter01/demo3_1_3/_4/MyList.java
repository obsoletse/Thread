package chapter01.demo3_1_3._4;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName MyList
 * @Author LinBin
 * @Date 2019/12/2 9:28
 * @Description :
 */
public class MyList {
    private static List list = new ArrayList<>();
    public static void add(){
        list.add("LinBin");
    }
    public static int getSize(){
        return list.size();
    }
}
