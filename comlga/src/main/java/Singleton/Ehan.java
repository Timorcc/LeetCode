package Singleton;

/**
 * @author lga
 * @date 2020-12-23 16:05
 * @desc 线程不安全，调用效率高，但是不能延时加载
 */
public class Ehan {
    private static Ehan ehan = new Ehan();

    private Ehan() {
    }

    public static  Ehan getEhan() {
        return ehan;
    }
}
