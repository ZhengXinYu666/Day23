package 线程礼让;

public class ThreadYield extends Thread {
    public void run() {
        for(int x = 0 ; x < 100; x++){
            System.out.println(getName()+":"+x);
            Thread.yield();
        }
    }
}
