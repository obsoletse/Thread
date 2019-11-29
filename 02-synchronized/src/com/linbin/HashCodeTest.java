package com.linbin;

/**
 * @ClassName HashCodeTest
 * @Author LinBin
 * @Date 2019/11/29 13:44
 * @Description : HashCode的使用
 */
public class HashCodeTest {
    public static void main(String[] args) {
        System.out.println("----------demo1----------");
        double x = 20.19;
        double y = 20.19;
        System.out.println(x == y);
      /*  System.out.println(x.equals(y));//报错。*/

        System.out.println("-----------demo2----------");
        Double a = new Double(29);
        Double b = new Double(29);
        System.out.println(a == b);
        System.out.println(a.equals(b));
        System.out.println(a.hashCode() + "  " + b.hashCode());
    }
    /**
     * 知识点:
     *  1.== 和 equals的区别
     *      ==可以比较值和对象，在基本数据类型中(byte,short,int,long,float,double,char,boolean)比较值;
     *                       在对象中比较对象的内存地址
     *  equals比较对象:大部分比较对象，但是对于八大基本数据类型的包装类中比较的是值
     *
     * 2.hashCode方法可以这样理解：它返回的就是根据对象的内存地址换算出的一个值。这样一来，当集合要添加新的元素时，先调用这个元素的hashCode方法，
     *  就一下子能定位到它应该放置的物理位置上。如果这个位置上没有元素，它就可以直接存储在这个位置上，不用再进行任何比较了；如果这个位置上已经有元素了，
     *  就调用它的equals方法与新元素进行比较，相同的话就不存了，不相同就散列其它的地址。这样一来实际调用equals方法的次数就大大降低了，几乎只需要一两次。
     *
     *  最主要目的:提高查找效率。hasCode可能相同，但是对象不一定相同
     */
}