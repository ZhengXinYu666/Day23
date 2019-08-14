package test;

public class test {
    /**
     * 同步的前提
     *      多个线程
     *      多个线程公用一个锁对象
     *
     * 好处：解决了多线程的安全问题
     * 弊端：当线程相当多时，每个线程都会去判断同步上的锁
     * 很耗费资源，无形中降低程序的运行效率
     *
     * @param args
     */
    public static void main(String[] args) {
        SellTickets st = new SellTickets();

        Thread t1 = new Thread(st,"窗口1");
        Thread t2 = new Thread(st,"窗口2");
        Thread t3 = new Thread(st,"窗口3");

        t1.start();
        t2.start();
        t3.start();
    }
}
