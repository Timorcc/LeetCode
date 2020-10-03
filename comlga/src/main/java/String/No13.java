package String;

import java.lang.annotation.ElementType;

/**
 * @author lga
 * @create 2020/10/3 0003
 * @desc * If I comes before V or X, subtract 1 eg: IV = 4 and IX = 9
 * * If X comes before L or C, subtract 10 eg: XL = 40 and XC = 90
 * * If C comes before D or M, subtract 100 eg: CD = 400 and CM = 900
 **/
public class No13 {
    public static int romanToInt(String s) {
        if (s == "" || s == null) {
            return 0;
        }
        int result = 0;
        int length = s.length() - 1;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'I' && i != length) {
                if (s.charAt(i + 1) == 'V') {
                    result += 4;
                    i++;
                    continue;
                }
                if (s.charAt(i + 1) == 'X') {
                    result += 9;
                    i++;
                    continue;
                }
            }
            if (s.charAt(i) == 'X' && i != length) {
                if (s.charAt(i + 1) == 'L') {
                    result += 40;
                    i++;
                    continue;
                }
                if (s.charAt(i + 1) == 'C') {
                    result += 90;
                    i++;
                    continue;
                }

            }
            if (s.charAt(i) == 'C' && i != length) {
                if (s.charAt(i + 1) == 'D') {
                    result += 400;
                    i++;
                    continue;
                }
                if (s.charAt(i + 1) == 'M') {
                    result += 900;
                    i++;
                    continue;
                }

            }
            if (s.charAt(i) == 'I') result += 1;
            if (s.charAt(i) == 'V') result += 5;
            if (s.charAt(i) == 'X') result += 10;
            if (s.charAt(i) == 'L') result += 50;
            if (s.charAt(i) == 'C') result += 100;
            if (s.charAt(i) == 'D') result += 500;
            if (s.charAt(i) == 'M') result += 1000;

        }
        return result;
    }


    public static void main(String[] args) {
        int s = romanToInt("DCXXI");
        System.out.println(s);
    }
}
