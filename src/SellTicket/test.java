package SellTicket;

/**
 * 产生了两个问题
 *
 * 1、相同的票卖了多次
 *      cpu的每一次执行必须是一个原子性（最简单最基本）的操作
 *
 * 2、出现了负数票
 *
 *
 *
 */
public class test {
    public static void main(String[] args) {
        //创建资源对象
        SellTicket st = new SellTicket();

        //创建三个线程对象
        Thread t1 = new Thread(st,"窗口1");
        Thread t2 = new Thread(st,"窗口2");
        Thread t3 = new Thread(st,"窗口3");

        //启动线程
        t1.start();
        t2.start();
        t3.start();
    }
}
