package huawei;

import java.util.Scanner;

/**
 * @author lga
 * @date 2021-03-29 22:17
 * @desc
 */
public class No12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        while (scanner.hasNext()) {
            String str = scanner.nextLine();
            for (int i = str.length()-1; i >=0 ; i--) {
                sb.append(str.charAt(i));
            }
            System.out.println(sb);
        }
    }
}
