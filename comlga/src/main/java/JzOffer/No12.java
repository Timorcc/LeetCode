package JzOffer;

/**
 * @author lga
 * @date 2021-04-09 19:04
 * @desc
 */
public class No12 {
    public double Power(double base, int exponent) {
        double res = base;
        if (exponent > 0) {
            for (int i = 0; i < exponent; i++) {
                res *= base;

            }
            return res;

        } else if (exponent < 0) {
            int abs = -exponent;
            for (int i = 0; i < abs; i++) {
                res *= base;
            }
            return 1 / res;
        } else {
            return 1;
        }

    }
}
