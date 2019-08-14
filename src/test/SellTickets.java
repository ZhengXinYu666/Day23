package test;

/**
 * 1、同步代码块的锁对象是谁呢？
 *      任意对象
 *
 *
 * 2、同步方法的格式及锁对象问题
 *      把同步关键字给在方法上
 *
 *
 * 3、同步方法的锁对象是谁呢？
 *         this
 *
 * 4、静态方法及锁对象问题
 *      静态随着类的加载而加载，加载的时候this都不存在
 *      静态方法的对象是当前类的class文件--类的字节码文件对象
 *      类名.class
 */
public class SellTickets implements Runnable {
    private int tickets = 100;
    private Object obj = new Object();
    private Demo d = new Demo();
    private int x = 0;

    @Override
    public void run() {
        while (true) {
            if (x % 2 == 0) {
                synchronized (obj) {
                    if (tickets > 0) {
                        try {
                            Thread.sleep(100);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println(Thread.currentThread().getName() + "正在出售第" + (tickets--) + "张票");
                    } else {
                        synchronized (d) {
                            if (tickets > 0) {
                                try {
                                    Thread.sleep(100);
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                                System.out.println(Thread.currentThread().getName() + "正在出售第" + (tickets--) + "张票");
                            }
                        }
                        x++;
                    }
                }
            }

        }

    }
    class Demo{
    }
}
