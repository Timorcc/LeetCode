package JzOffer;

import java.util.ArrayList;

/**
 * @author lga
 * @date 2021-04-09 19:19
 * @desc
 */
public class No13 {
    public int[] reOrderArray(int[] array) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 1) {
                list1.add(array[i]);
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                list2.add(array[i]);
            }
        }
        list1.addAll(list2);
        int[] res = new int[list1.size()];
        for (int i = 0; i < list1.size(); i++) {
            res[i] = list1.get(i);
        }
        return res;
    }
}
