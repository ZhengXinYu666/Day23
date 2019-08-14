package Demo;

import java.util.*;

/**
 * 几种线程安全的类
 */
public class ThreadDemo {
    public static void main(String[] args) {
        //效率较低，方法中都有锁
        StringBuffer sb = new StringBuffer();
        Vector<String> v = new Vector<String>();
        Hashtable<String,String> hs = new Hashtable<String,String>();

        //Vector是线程安全的时候才考虑使用的吗，但是即使要安全，也不用这个
        //到底用哪个呢？
        //synchronizedList
        List<String> lsit1 = new ArrayList<String>();//线程不安全
        List<String> list2 = Collections.synchronizedList(new ArrayList<String>());
    }
}
