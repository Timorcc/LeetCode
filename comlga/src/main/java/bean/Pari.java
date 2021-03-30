package bean;

/**
 * @author lga
 * @date 2021-01-06 14:57
 * @desc
 */
public class Pari<T> {
    private T value;

    public Pari(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
