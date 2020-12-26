package Singleton;

/**
 * @author lga
 * @date 2020-12-25 20:21
 * @desc
 */
public class SingletonDemo {
    private volatile static SingletonDemo instance;

    private SingletonDemo() {
        StringBuffer s = new StringBuffer();

    }

    public SingletonDemo getInstance() {
        if (instance == null) {
            synchronized (SingletonDemo.class) {
                if (instance == null) {
                    instance = new SingletonDemo();
                }
            }
        }
        return instance;
    }
}
