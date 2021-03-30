package huawei;

import java.util.Scanner;

/**
 * @author lga
 * @date 2021-03-29 21:09
 * @desc
 */
public class No6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            Long num = scanner.nextLong();
            while (num != 1) {
                for (int i = 2; i <= num; i++) {
                    if (num % i == 0) {
                        num /= i;
                        System.out.println(i+" ");
                        break;
                    }
                }
            }
        }
    }
}
