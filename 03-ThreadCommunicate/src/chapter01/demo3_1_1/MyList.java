package chapter01.demo3_1_1;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName MyList
 * @Author LinBin
 * @Date 2019/12/2 9:28
 * @Description :
 */
public class MyList {
    private List list = new ArrayList<>();
    public void add(){
        list.add("LinBin");
    }
    public int getSize(){
        return list.size();
    }
}
