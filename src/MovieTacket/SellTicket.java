package MovieTacket;

public class SellTicket extends Thread {

    //private int tickets = 100;
    //静态修饰，让多个线程对象共享这100张票
    private static int tickets = 100;
    @Override
    public void run() {
        //定义100张票
        //每个线程都会金来这里，这样的话，每个线程对象相当于卖的是自己的那100张票，应该定义到外面
        //int tickets = 100;

        //为了模拟一直邮票
        while(true) {
            if (tickets > 0) {
                System.out.println(getName() + "正在出售第" + (tickets--) + "张票");
            }
        }
    }
}
