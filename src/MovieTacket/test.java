package MovieTacket;

/**
 * 某电影院正在上映贺岁大片《上海堡垒》《哪吒》
 * 一共100张票
 * 共有三个售票窗口，设计一个程序模拟电影院售票
 *
 *
 */
public class test {
    public static void main(String[] args) {
        SellTicket st1 = new SellTicket();
        SellTicket st2 = new SellTicket();
        SellTicket st3 = new SellTicket();

        st1.setName("窗口1");
        st2.setName("窗口2");
        st3.setName("窗口3");

        //启动线程
        st1.start();
        st2.start();
        st3.start();

    }
}
