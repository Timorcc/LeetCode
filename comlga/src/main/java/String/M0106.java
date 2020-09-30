package String;

public class M0106 {
    public String compressString(String S) {
        if (S == null || S.length() == 0) {
            return null;
        }
        StringBuffer result = new StringBuffer();
        result.append(S.charAt(0));
        int count = 1;
        for (int i = 1; i < S.length(); i++) {
            if (S.charAt(i) == S.charAt(i - 1)) {
                count++;
            } else {
                result.append(count);
                result.append(S.charAt(i));
                count = 1;
            }
        }
        result.append(count);
        return result.length() >= S.length() ? S : result.toString();
    }
}
