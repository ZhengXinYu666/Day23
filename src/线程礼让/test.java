package 线程礼让;

/**
 * public static void yield()：暂停当前正在执行的线程对象，并执行
 * 让多个线程的执行更和谐，但是不能靠这个保证一人一次
 */
public class test {
    public static void main(String[] args) {
        ThreadYield ty1 = new ThreadYield();
        ThreadYield ty2 = new ThreadYield();

        ty1.setName("露娜");
        ty2.setName("韩信");

        ty1.start();
        ty2.start();
    }
}
