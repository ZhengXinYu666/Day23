package SellTicket;

/**
 * 如何解决这个问题呢？
 * 首先想为什么出问题呢？（判断程序是否有线程安全问题）
 *
 * A、是否是多线程环境？
 * B、是否有共享数据？
 * C、是否有多条语句操作共享数据？
 *
 * 回想一下程序有无上述几个问题？
 * 多线程环境 3个线程
 * 有共享数据 100张票
 * 有多条语句操作共享数据
 * 思想：
 *      把多条语句操作共享数据的代码包成个整体，让某个线程在执行的时候，别人不能来执行
 *      Java提供了同步机制
 *      同步代码块
 *      synchronized(对象){
 *      需要同步的代码
 *      }
 *
 *      1、对象是什么呢？
 *
 *      2、需要同步的代码是哪些呢？
 *      需要共享数据的地方
 *
 *      注意：同步可以解决安全问题的根本原因就在那个对象上，该对象如同锁的功能
 *      多个线程必须是同一把锁
 */
public class SellTicket implements Runnable {
    private int tickets = 100;
    private Object obj = new Object();
    @Override
    public void run() {
        synchronized(obj){
        while(true){
            if(tickets > 0) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    System.out.println(Thread.currentThread().getName() + "正在出售第" + (tickets--) + "张票");
                }
                }
            }
        }
    }
}
