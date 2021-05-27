package meituan;

import com.sun.org.apache.bcel.internal.generic.RET;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author lga
 * @date 2021-03-27 16:06
 * @desc
 */
public class Meituan01 {

    public static String getResult(String s) {
        StringBuffer buf1 = new StringBuffer(s);
        StringBuffer revbuf = buf1.reverse();
        StringBuffer buf2 = new StringBuffer();
        StringBuffer temp = new StringBuffer();

        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (revbuf.charAt(i) != s.charAt(i)) {
                count += 2;
                temp.append(revbuf.charAt(i));
                if (count > 2) {
                    break;
                }
            } else {
                temp.append(s.charAt(i));
            }
        }

        if (count <= 2) {
            return temp.toString();
        } else {
            boolean flag = true;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) != '0' && flag) {
                    buf2.append("0");
                    flag = false;
                } else {
                    buf2.append(s.charAt(i));
                }
            }
            return buf2.toString();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            String x = sc.next();
            System.out.println(getResult(x));
        }
    }

}
