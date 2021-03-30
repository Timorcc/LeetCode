package huawei;

import java.util.Scanner;

/**
 * @author lga
 * @date 2021-03-29 22:39
 * @desc
 */
public class No15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int res = 0;
        while (scanner.hasNext()) {
            int num = scanner.nextInt();
            String bir = Integer.toBinaryString(num);
            for (int i = 0; i < bir.length(); i++) {
                System.out.println(bir.charAt(i));
                if (bir.charAt(i)  == '1') {
                    res++;
                }
            }
            System.out.println(res);
        }
    }
}
