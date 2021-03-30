package huawei;

import java.util.Scanner;

/**
 * @author lga
 * @date 2021-03-28 9:32
 * @desc
 */
public class No4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String str = scanner.nextLine();
            if (str.length() % 8 != 0) {
                str = str + "00000000";
            }

            while (str.length() >= 8) {
                System.out.println(str.substring(0, 8));
                str = str.substring(8);
            }
        }
    }
}
