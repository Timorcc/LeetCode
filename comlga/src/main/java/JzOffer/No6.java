package JzOffer;

import java.util.Arrays;

/**
 * @author lga
 * @date 2021-04-09 18:15
 * @desc
 */
public class No6 {
    public int minNumberInRotateArray(int[] array) {
        if (array.length == 0) {
            return 0;
        } else {
            Arrays.sort(array);
            return array[0];
        }

    }
}
