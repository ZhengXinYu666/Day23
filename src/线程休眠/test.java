package 线程休眠;

/**
 * 线程休眠
 *
 */
public class test {
    public static void main(String[] args) {
        ThreadSleep ts1 = new ThreadSleep();
        ThreadSleep ts2 = new ThreadSleep();
        ThreadSleep ts3 = new ThreadSleep();

        ts1.setName("花木兰");
        ts2.setName("公孙离");
        ts3.setName("上官婉儿");

        ts1.start();
        ts2.start();
        ts3.start();
    }
}
