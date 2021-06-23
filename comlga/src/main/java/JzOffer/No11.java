package JzOffer;

/**
 * @author lga
 * @date 2021-04-09 18:57
 * @desc
 */
public class No11 {
    public int NumberOf1(int n) {
        int count = 0;
        while (n != 0) {
            count++;
            n &= n - 1;
        }
        return count;
    }
}
