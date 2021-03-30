package huawei;

import java.util.*;

/**
 * @author lga
 * @date 2021-03-29 22:24
 * @desc
 */
public class No14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            String str = scanner.next();
            arr[i] = str;
        }
        Arrays.sort(arr);
        for (int i = 0; i < args.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
