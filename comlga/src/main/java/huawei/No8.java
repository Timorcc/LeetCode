package huawei;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author lga
 * @date 2021-03-29 21:38
 * @desc
 */
public class No8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int k = scanner.nextInt();
            int v = scanner.nextInt();
            if (map.get(k) != null) {
                map.put(k, v + map.get(k));
            } else {
                map.put(k, v);
            }
        }
        for (Integer k : map.keySet()
        ) {
            System.out.println(k + " " + map.get(k));
        }
    }
}

