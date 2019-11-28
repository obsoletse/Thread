package com.linbin.chatper02.demo2_2_13;

/**
 * @ClassName PublicClass
 * @Author LinBin
 * @Date 2019/11/28 14:14
 * @Description :
 */
public class PublicClass {
    private String username;
    private String password;
    class PrivateClass{
        private String age;
        private String address;

        public String getAge() {
            return age;
        }

        public void setAge(String age) {
            this.age = age;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    static class PrivateClass2{
        private String province;

        public String getProvince() {
            return province;
        }

        public void setProvince(String province) {
            this.province = province;
        }
    }
}
