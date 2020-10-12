package String;

public class M0102 {
    public boolean CheckPermutation(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        int[] nums = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            nums[s1.charAt(i) - 97]++;
            nums[s2.charAt(i)  - 97]--;
        }
        for (int num : nums
        ) {
            if (num != 0) return false;
        }
        return true;
    }
}
