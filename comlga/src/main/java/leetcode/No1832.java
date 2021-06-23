package leetcode;

/**
 * @author lga
 * @date 2021-05-12 21:39
 * @desc
 */
public class No1832 {
    public boolean checkIfPangram(String sentence) {
        boolean[] b = new boolean[26];
        if (sentence.length()<26){
            return false;
        }
        for (int i = 0; i < sentence.length(); i++) {
            b[sentence.charAt(i)-'a']=true;
        }
        for (int i = 0; i < 26; i++) {
            if (!b[i]){
                return false;
            }
        }
        return true;
    }
}
