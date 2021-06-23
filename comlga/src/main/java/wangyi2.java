import java.util.Scanner;

/**
 * @author lga
 * @date 2021-04-18 16:36
 * @desc
 */
public class wangyi2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();

        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            int temp = scanner.nextInt();
            if (i % 2 == 1) {
                temp = -temp;
            }
            arr[i] = temp;
        }

//        int  x = arr[0];
//        for ( int i = 1; i < arr.length; i++) {
//            arr[i]=Math.max(arr[i], arr[i-1]+arr[i]);
//            x = Math.max(x,arr[i]);
//        }
//        System.out.println(x);
        for (int i = 0; i < length; i++) {
            System.out.print(arr[i]+" ");
        }


        int pre = 0, maxAns = arr[0];
        for (int x : arr
        ) {
        pre = Math.max(pre+x,x);
        maxAns = Math.max(maxAns,pre);
        }
        System.out.println(maxAns);

    }
}
