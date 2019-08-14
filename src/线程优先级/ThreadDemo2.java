package 线程优先级;

/**
 * 如何获取线程对象的优先级？
 *      public final int getPriority():返回线程对象的优先级
 * 如何设置线程对象的优先级呢？
 *      public final void setPriority(int newPriority):更该线程的优先级
 *
 *
 *      注意：
 *          线程默认优先级为5
 *          最低为1 最高为10
 *          线程优先级仅仅表示线程获取CPU时间片的几率
 *          存在随机性，多次运行可看出效果
 */
public class ThreadDemo2 {
    public static void main(String[] args) {
        ThreadPriority tp1 = new ThreadPriority();
        ThreadPriority tp2 = new ThreadPriority();
        ThreadPriority tp3 = new ThreadPriority();

        tp1.setName("花木兰");
        tp2.setName("公孙离");
        tp3.setName("上官婉儿");


        //获取默认优先级
//        System.out.println(tp1.getPriority());
//        System.out.println(tp2.getPriority());
//        System.out.println(tp3.getPriority());

        //设置线程优先级   强占式调度模型存在随机性
        tp1.setPriority(10);
        tp2.setPriority(5);
        tp3.setPriority(1);

        //启动线程
        tp1.start();
        tp2.start();
        tp3.start();
    }
}
