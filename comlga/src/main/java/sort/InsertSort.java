package sort;

import java.util.Arrays;

/**
 * @author lga
 * @date 2021-03-03 18:54
 * @desc
 * 直接插入排序:每次将一个待排序的元素插入到合适的已经排序的位置
 * 空间：O(1)
 * 时间：O(n^2)
 * 稳定
 */
public class InsertSort {
    public static void sort(int[] arr) {
        if (arr ==null || arr.length<=1) return;
        int length = arr.length;
        int i,j,temp;
        for (i = 1; i < length; i++) {
            temp = arr[i];
            j =i-1;
            while (j>=0 && temp < arr[j]) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{6, 5, 8, 7, 4, 1, 2, 3};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
