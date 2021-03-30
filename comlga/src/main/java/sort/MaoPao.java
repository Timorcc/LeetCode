package sort;

import java.util.Arrays;

/**
 * @author lga
 * @date 2021-03-02 10:41
 * @desc
 * 冒泡排序
 * 空间O(1)
 * 时间O(n^2)
 * 稳定
 */
public class MaoPao {
    public static void sort(int[] arr) {
        int length = arr.length;
        int i, j, temp ,flag;
        for (i = 0; i < length-1; i++) {
            flag = 0 ;
            for (j=0;j<length-i-1;j++){
                if (arr[j]>arr[j+1]){
                    temp =arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag =1 ;
                }
            }
            if (flag == 0)
                return;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 6};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
