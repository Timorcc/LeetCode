import java.util.*;

/**
 * @author lga
 * @date 2021-03-27 16:27
 * @desc
 */
public class Meituan03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[m];
        for (int i = 0; i < n; i++) {
            int temp = sc.nextInt();
            arr1[i] = temp;
        }
        for (int i = 0; i < m; i++) {
            int temp = sc.nextInt();
            arr2[i] = temp;
        }
        getResult(arr1, arr2);
    }

    private static void getResult(int[] arr1, int[] arr2) {
        Map<Integer, Integer> startMap = new HashMap<>();
        Map<Integer, Integer> endMap = new HashMap<>();
        for (int i = 0; i < arr1.length; i++) {
            if (startMap.containsKey(arr1[i])) {
                startMap.put(arr1[i], i + 1);
            }
            endMap.put(arr1[i], i + 1);
        }
        for (int i = 0; i < arr1.length; i++) {
            if (startMap.containsKey(arr2[i])) {
                System.out.println(startMap.get(arr2[i]) + " " + endMap.get(arr2[i]));
            } else {
                System.out.println(0);
            }
        }
    }
}
//
//        for (int i = 0; i < arr2.length; i++) {
//            List<Integer> list = new ArrayList<>();
//            for (int j = 0; j < arr1.length; j++) {
//                if (arr1[j] == arr2[i]) {
//                    list.add(j + 1);
//                }
//            }
//            if (list.size() == 0) {
//                System.out.println(0);
//            }
//            if (list.size() == 1) {
//                System.out.println(list.get(0) + " " + list.get(0));
//            }
//            if (list.size() > 1) {
//                System.out.println(list.get(0) + " " + list.get(list.size() - 1));
//            }
//        }
//    }



