package huawei;

import java.util.Scanner;

/**
 * @author lga
 * @date 2021-03-29 22:21
 * @desc
 */
public class No13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        while (scanner.hasNext()) {
            String str = scanner.nextLine();
            String[] arr= str.split(" ");
            for (int i = arr.length-1; i >=0 ; i--) {
                System.out.print(arr[i]+" ");
            }

        }
    }
}
