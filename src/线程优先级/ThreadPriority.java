package 线程优先级;

public class ThreadPriority extends Thread {
    @Override
    public void run() {
        for(int x = 0 ; x < 100; x++){
            System.out.println(getName()+":"+x);
        }
    }
}
