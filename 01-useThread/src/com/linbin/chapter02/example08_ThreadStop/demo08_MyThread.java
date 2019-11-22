package com.linbin.chapter02.example08_ThreadStop;

/**
 * @ClassName demo08_MyThread
 * @Author LinBin
 * @Date 2019/11/21 10:11
 * @Description : stop释放锁导致数据脏读
 */
public class demo08_MyThread extends Thread{
    private demo08_SynchronizedObject synchronizedObject;
    public demo08_MyThread(){};
    public demo08_MyThread(demo08_SynchronizedObject synchronizedObject){
        super();
        this.synchronizedObject = synchronizedObject;
    }
    @Override
    public void run() {
        super.run();
        synchronizedObject.printString("b","bb");
    }

    public static void main(String[] args) {
        try {
            demo08_SynchronizedObject synchronizedObject = new demo08_SynchronizedObject();
            demo08_MyThread thread = new demo08_MyThread(synchronizedObject);
            thread.start();
            Thread.sleep(2000);
            thread.stop();
            System.out.println("username = " + synchronizedObject.getUsername() + " , password = " + synchronizedObject.getPassword());
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
