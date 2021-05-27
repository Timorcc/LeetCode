package leetcode;

import java.util.HashMap;

/**
 * @author lga
 * @date 2021-03-26 23:30
 * @desc abcabcbb
 */
public class No3 {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) {
            return 0;
        }
        HashMap<Character, Integer> map = new HashMap<>();
        int max = 0, i = 0, j = 0;
        while (j < s.length()) {
            if (map.containsKey(s.charAt(j))) {
                i = Math.max(i, map.get(s.charAt(j)) + 1);
            }
            map.put(s.charAt(j), j);
            max = Math.max(max, j - i + 1);
            j++;
        }
        return max;
    }
}
