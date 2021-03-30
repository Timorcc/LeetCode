package JzOffer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

/**
 * @author lga
 * @date 2021-02-27 23:13
 * @desc
 */
public class No2 {
    public static String replaceSpace(String s) {
        StringBuilder res = new StringBuilder();
        int length = s.length();
        for (int i = 0; i < length; i++) {
            if (s.charAt(i) == ' ') {
                res.append("%20");
            } else {
                res.append(s.charAt(i));
            }
        }
        return res.toString();
    }

    public static void main(String[] args) {
        System.out.println(replaceSpace("We Are Happy"));
    }
}
