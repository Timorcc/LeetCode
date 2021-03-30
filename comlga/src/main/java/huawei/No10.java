package huawei;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @author lga
 * @date 2021-03-29 22:07
 * @desc
 */
public class No10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Set<Character> set = new HashSet<>();
        while (scanner.hasNext()) {
            String str = scanner.nextLine();
            for (int i = 0; i < str.length(); i++) {
                set.add(str.charAt(i));
            }
            System.out.println(set.size());
        }
    }
}
