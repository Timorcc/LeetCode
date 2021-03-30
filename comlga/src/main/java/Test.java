import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            List<Integer> list = new ArrayList();
            for (int i = 0; i < n; i++) {
                list.add(scanner.nextInt());
            }
            Collections.sort(list);
            for (int j = 0; j < list.size(); j++) {
                if (j!=list.size()-1){
                   if (list.get(j).equals(list.get(j + 1))){
                       j++;
                   }
                }else {
                    System.out.println(list.get(j));
                }
            }

        }


    }


    public static int getResult(int[] arr) {
        int len = arr.length;
        int[] pre1 = new int[len];
        int[] pre2 = new int[len];
        pre1[0] = arr[0];
        for (int i = 1; i < len; i++) {
            if (arr[i] != 0) {
                pre1[i] = pre1[i - 1] + 1;
            } else {
                pre1[i] = 0;
            }
        }
        pre2[len - 1] = arr[len - 1];
        for (int i = len - 2; i >= 0; i--) {
            if (arr[i] != 0) {
                pre2[i] = pre2[i + 1] + 1;
            } else {
                pre2[i] = 0;
            }
        }
        int ans = 0;
        for (int i = 0; i < len; i++) {
            int preSum = i == 0 ? 0 : pre1[i - 1];
            int sufSum = i == len - 1 ? 0 : pre2[i + 1];
            ans = Math.max(ans, preSum + sufSum);
        }
        return ans;
    }

}