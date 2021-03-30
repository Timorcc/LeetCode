package DeadLock;

import java.sql.SQLOutput;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author lga
 * @date 2021-03-12 15:24
 * @desc
 */
public class DeadLock {
    private static Object resource1 = new Object();
    private static Object resource2 = new Object();

    public static void main(String[] args) {


        new Thread(()->{
            synchronized (resource1){
                System.out.println(Thread.currentThread()+"get resource1");
                try {
                    Thread.sleep(1000);
                }catch (Exception e){
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread() + "wait get resource2");
                synchronized (resource2){
                    System.out.println(Thread.currentThread()+"get resource2");
                }
            }
        },"线程1").start();
        new Thread(()->{
            synchronized (resource2){
                System.out.println(Thread.currentThread()+"get resource2");
                try {
                    Thread.sleep(1000);
                }catch (Exception e){
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread() + "wait get resource1");
                synchronized (resource1){
                    System.out.println(Thread.currentThread()+"get resource1");
                }
            }
        },"线程2").start();
    }

}
