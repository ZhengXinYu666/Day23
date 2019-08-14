package Runnable;

/**
 * 方式2：实现Runnable接口
 * 步骤：
 *     1、自定义类MyRunnable实现Runnable接口
 *     2、重写run方法
 *     3、创建MyRunnable 类的对象
 *     4、创建Thread类的独享，并把3步骤的对象作为构造参数传递
 */
public class MyRunableDemo {
    public static void main(String[] args) {
        //创建MyRunnable类的对象
        MyRunnable my = new MyRunnable();

        //创建Thread类的对象
        //Thread(Runnable target)
//        Thread t1 = new Thread(my);
//        Thread t2 = new Thread(my);
//        t1.setName("李白");
//        t2.setName("韩信");

        Thread t1 = new Thread(my,"李白");
        Thread t2 = new Thread(my,"韩信");



        t1.start();
        t2.start();
    }
}
