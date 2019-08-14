package 后台线程;

public class ThreadDaemon extends Thread {
    @Override
    public void run() {
        for(int x = 0; x<100;x++){
            System.out.println(getName()+":"+x);
        }
    }
}
