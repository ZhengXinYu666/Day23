package 线程;

/**
 * 针对不是Thread子类的类如何获取线程对象名称呢？
 * Thread.currentThread().getName()
 *
 * 线程的生命周期：
 *  新建：创建线程对象
 *  就绪：有执行资格，没有执行权
 *  运行：有执行资格，有执行权
 *      阻塞：由于一些操作，让线程阻塞。没有执行资格，没有执行权
 *      而另一些操作却可以把它激活，激活后处处于就绪态
 *  死亡：线程对象变成垃圾，等待被回收
 */
public class ThreadDemo {
    public static void main(String[] args) {
        //无参构造+setXxx()
//        SellTicket m1 = new SellTicket();
//        SellTicket m2 = new SellTicket();
//        //调用方法设置名称
//        m1.setName("李白");
//        m2.setName("韩信");
//        SellTicket m1 = new SellTicket("李白");
//        SellTicket m2 = new SellTicket("韩信");
//        m1.start();
//        m2.start();
        //如何获取main方法所在的线程对象的名称？
        System.out.println(Thread.currentThread().getName());
    }
}
