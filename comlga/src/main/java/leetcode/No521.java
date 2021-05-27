package leetcode;

/**
 * @author lga
 * @date 2020-12-28 22:34
 * @desc
 */
public class No521 {
    public int findLUSlength(String a, String b) {
        if(a.equals(b))return -1;
        else
            return Math.max(a.length(),b.length());


    }
}
