package com.linbin.chatper02.demo2_2_13;

/**
 * @ClassName demo
 * @Author LinBin
 * @Date 2019/11/28 14:17
 * @Description :
 */
public class demo {
    public static void main(String[] args) {
        PublicClass publicClass = new PublicClass();
        publicClass.setUsername("username");
        publicClass.setPassword("password");
        /*内部类---创建依赖外部PublicClass类*/
        PublicClass.PrivateClass privateClass = publicClass.new PrivateClass();
        privateClass.setAddress("address");
        /*静态内部类---自己独立存在*/
        PublicClass.PrivateClass2 privateClass2 = new PublicClass.PrivateClass2();
        privateClass2.setProvince("province");
        System.out.println(privateClass.getAddress());
        System.out.println(privateClass2.getProvince());
    }
}
