package Runnable;

public class MyRunnable implements Runnable{
    @Override
    public void run() {
        for (int x = 0; x < 100; x++){
            //由于实现接口的方式，所以不能直接使用Thread类的方法，可以间接使用
            System.out.println(Thread.currentThread().getName()+":"+x);
        }
    }
}
