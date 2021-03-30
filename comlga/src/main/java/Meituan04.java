import java.util.Scanner;

/**
 * @author lga
 * @date 2021-03-27 16:50
 * @desc
 */
public class Meituan04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            int temp = sc.nextInt();
            arr[i] = temp;
        }
        System.out.println(getRes(arr, k));
    }


    public static int getRes(int[] arr, int len) {
        if (arr.length==0|| len> arr.length){
            return 0;
        }
        int res = 0;

        for (int i = 0; i <= arr.length - len; i++) {
            for (int j = 0; j < len; j++) {
                res = Math.max(res, arr[i] ^ arr[i + j]);
            }
        }
        return res;
    }
}