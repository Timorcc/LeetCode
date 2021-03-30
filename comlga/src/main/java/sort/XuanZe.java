package sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author lga
 * @date 2021-03-02 11:13
 * @desc
 */
public class XuanZe {
    public static void sort(int[] arr) {
        int length = arr.length;
        int temp, pos;
        for (int i = 0; i < length - 1; i++) {
            pos = 0;
            for (int j = 0; j < length - i; j++) {
                if (arr[j] > arr[pos])
                    pos = j;
            }
            temp = arr[pos];
            arr[pos] = arr[length - 1 - i];
            arr[length - 1 - i] = temp;
        }
    }

    public static void main(String[] args) {
        List list = new ArrayList();
        int[] arr = {5, 7, 9, 3, 1, 4, 8};
        System.out.println(Arrays.toString(arr));
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
