package huawei;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @author lga
 * @date 2021-03-29 22:12
 * @desc
 */
public class No11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        while (scanner.hasNext()) {
            int num = scanner.nextInt();
            String con = String.valueOf(num);

            for (int i = con.length() - 1; i >= 0; i--) {
                sb.append(con.charAt(i));
            }
            System.out.println(sb);
        }
    }
}
