package 线程加入;

/**
 * public final void join()：等待线程终止
 *
 * 为了让某些线程执行完毕 引入线程加入
 */
public class test {
    public static void main(String[] args) {
        ThreadJoin tj1 = new ThreadJoin();
        ThreadJoin tj2 = new ThreadJoin();
        ThreadJoin tj3 = new ThreadJoin();

        tj1.setName("刘备");
        tj2.setName("孙尚香");
        tj3.setName("刘禅");

        tj1.start();
        try {
            tj1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        tj2.start();
        tj3.start();
    }
}
