package Singleton;

/**
 * @author lga
 * @date 2020-12-23 16:10
 * @desc 线程不安全，调用效率不高，但是能延时加载
 */
public class Lhan {
    private static Lhan lhan;

    private Lhan() {
    }

    public static synchronized  Lhan getInstance() {
        if (lhan == null) {
            lhan = new Lhan();
        }
        return lhan;
    }
}
