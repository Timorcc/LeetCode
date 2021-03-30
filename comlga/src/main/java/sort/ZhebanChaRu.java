package sort;

import java.util.Arrays;

/**
 * @author lga
 * @date 2021-03-03 19:35
 * @desc
 * 折半插入排序：在直接插入排序上改进，减少了比较次数约为O(nlogn)
 * 空间O(1)
 * 时间O(n^2)
 * 稳定
 */
public class ZhebanChaRu {
    public static void sort(int[] arr) {
        int length = arr.length;
        int i, j, mid, temp, low, high;

        for (i = 1; i < length; i++) {
            temp = arr[i];
            low = 0;
            high = i - 1;
            while (low <= high) {
                mid = (low + high) / 2;
                if (arr[mid] > temp) {
                    high = mid - 1;
                }
                if (arr[mid] < temp) {
                    low = mid + 1;
                }
            }
            for (j = i; j >= low + 1; j--) {
                arr[j] = arr[j - 1];
            }
            arr[low] = temp;

        }

    }

    public static void main(String[] args) {
        int[] arr = new int[]{5, 6, 4, 1, 2, 3, 9, 8, 7};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
