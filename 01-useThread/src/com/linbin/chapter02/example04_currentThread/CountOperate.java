package com.linbin.chapter02.example04_currentThread;

/**
 * Thread.currentThread.getName()和this.getName()的区别:
 * Thread.currentThread.getName()--当前被调用的线程名称--空参构造是main线程调用的，run方法是自定义的A线程调用的
 * this.getName()--当前对象的名称
 */
public class CountOperate extends Thread {
    public CountOperate(){
        System.out.println("CountOperate---begin");
        System.out.println("Thread.currentThread.getName() = " + Thread.currentThread().getName());//main线程被调用空参构造来创建实例
        System.out.println("this.currentThread.getName() = " + this.currentThread().getName());//this.currentThread.getName()与上面一致
        System.out.println("this.getName() = " + this.getName()); ///获取当前对象线程的线程名
        System.out.println("CountOperate---end");
    }
    @Override
    public void run() {
        System.out.println("run---begin");
        System.out.println("Thread.currentThread.getName() = " + Thread.currentThread().getName());
        System.out.println("this.currentThread.getName() = " + this.currentThread().getName());
        System.out.println("this.getName() = " + this.getName());//获取当前对象线程的线程名
        System.out.println("run---end");
    }

    public static void main(String[] args) {
        CountOperate countOperate = new CountOperate();
        countOperate.setName("a");
        Thread thread1 = new Thread(countOperate);
        /**
         * 通过对Thread源码分析，countOperate 赋值给了 一个私有private Runnable target; target变量上,
         * 当thread启动线程并调用run的时候，实际上底层是target调用了run，this.getName()实际上返回的是target.getName()，
         */
        thread1.setName("A");
        thread1.start();
    }
}
/**
 * 这个例子中有两个实例类，Run和CountOperate,首先创建CountOperate类，哪个线程在创建这个类呢？当然是main线程，那么当然在类初始化的时候会取调构造方法，
 * 打印的当前线程的名字就是main，this.getName()这个方法要注意了，本身CountOperate这个类是没有这个方法的，这个方法是其父类Thread的，
 * 所以这里其实就是调用其父类的方法，那么这个方法目前还没有被重写，所以调用它会给出默认的值即：Thread-0
 *
 * 以上就是初始化的步骤，其次线程直接调用了start（）方法，这时这个线程已经被命名了，所以当前线程是A，this.getName（）调用得到的是重写后的值A。
 */
