package String;

public class No1370 {
    public String sortString(String s) {
        int[] count = new int[26];
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
        }
        StringBuffer result = new StringBuffer();

        while (result.length() < s.length()) {
            for (int i = 0; i < 26; i++) {
                if (count[i] > 0) {
                    count[i]--;
                    result.append((char) (i + 97));
                }
            }
            for (int i = 25; i >= 0; i--) {
                if (count[i] > 0) {
                    count[i]--;
                    result.append((char) (i + 97));
                }
            }
        }
        return result.toString();
    }
}
