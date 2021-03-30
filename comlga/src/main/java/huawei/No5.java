package huawei;

import java.util.Scanner;

/**
 * @author lga
 * @date 2021-03-29 21:05
 * @desc
 */
public class No5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String str = scanner.nextLine();
            System.out.println(Integer.decode(str));
        }
    }
}
