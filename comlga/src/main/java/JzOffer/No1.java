package JzOffer;

/**
 * @author lga
 * @date 2021-04-09 13:53
 * @desc
 */
public class No1 {
    public boolean Find(int target, int[][] array) {
        int i = array.length - 1;
        int j = 0;

        while (i >= 0 && j < array.length) {

            if (array[i][j] > target) {
                i--;
            } else if (array[i][j] < target) {
                j++;
            } else {
                return true;
            }
        }
        return false;
    }

}
