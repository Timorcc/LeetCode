package JzOffer;

/**
 * @author lga
 * @date 2021-04-09 18:24
 * @desc
 */
public class No7 {
    public int Fibonacci(int n) {
        if (n < 2) {
            return n;
        }
        else {
            return Fibonacci(n - 1) + Fibonacci(n - 2);
        }

    }
}
