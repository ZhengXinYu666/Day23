package 线程加入;

public class ThreadJoin extends Thread {
    public void run() {
        for(int x = 0 ; x < 100; x++){
            System.out.println(getName()+":"+x);
        }
    }
}
