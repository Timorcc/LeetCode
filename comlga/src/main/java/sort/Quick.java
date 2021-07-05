package sort;

import java.util.Arrays;

public class Quick {

    public static void sort(int[] arr, int low, int high) {
        if (low > high) return;
        int t, i, j, temp;
        temp = arr[low];
        i = low;
        j = high;
        while (i < j) {
            while (i < j && arr[j] >= temp) j--;
            while (i < j && arr[i] <= temp) i++;
            if (i < j) {
                t = arr[i];
                arr[i] = arr[j];
                arr[j] = t;
            }
        }
        arr[low] = arr[i];
        arr[i] = temp;
        sort(arr, low, i - 1);
        sort(arr, i + 1, high);
    }


    public static void main(String[] args) {
        int[] arr = new int[]{9, 8, 5, 6, 3, 2, 1};
        sort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

}