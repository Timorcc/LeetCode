import java.util.Scanner;

/**
 * @author lga
 * @date 2021-03-27 17:41
 * @desc
 */
public class Meituan02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            int c1 = scanner.nextInt();
            int c2 = scanner.nextInt();
            int flaseLength = 0;
            int Mp = 0;
            int min = Math.min(c1, c2);
            String str = scanner.next();
            for (int i = 0; i < n; i++) {
                if (str.charAt(i) == 'T') {
                    flaseLength = 0;
                } else if (flaseLength == 2) {
                    flaseLength = 0;
                    Mp += min;
                } else {
                    flaseLength++;
                }
            }
            System.out.println(Mp);
        }

    }
}
