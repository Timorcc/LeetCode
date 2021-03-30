package huawei;

import java.awt.*;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author lga
 * @date 2021-03-29 21:50
 * @desc
 */
public class No9 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            Integer a = scanner.nextInt();


            Set<Integer> set = new LinkedHashSet<>();
            while (a != 0) {
                int mod = a % 10;
                a = a / 10;
                set.add(mod);
            }
            StringBuilder sb = new StringBuilder();
            for (Integer c : set
            ) {
                sb.append(c);
            }
            System.out.println(Integer.valueOf(String.valueOf(sb)));

        }
    }
}