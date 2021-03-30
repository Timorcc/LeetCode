package JzOffer;

/**
 * @author lga
 * @date 2021-02-27 22:51
 * @desc
 */
public class No1 {
    public static boolean Find(int target, int[][] array) {
        int length = array.length - 1;
        int i = 0;
        while (length >= 0 && i < array[0].length) {
            if (array[length][i] > target) {
                length--;
            } else if (array[length][i] < target) {
                i++;
            } else return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int target = 7;
        int[][] array = {{1, 2, 8, 9}, {2, 4, 9, 12}, {
                4, 7, 10, 13}, {6, 8, 11, 15}};
        System.out.println(Find(target,array));
    }

}
