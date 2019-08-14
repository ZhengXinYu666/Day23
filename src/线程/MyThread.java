package 线程;

/**
 * setName()方法设置线程对象的名称
 */
public class MyThread extends Thread {

    public MyThread(){}

    public MyThread(String name){
        super(name);
    }

    public void run() {
        for(int x = 0;x<200;x++){
            System.out.println(getName()+":"+x);
        }
    }
}
