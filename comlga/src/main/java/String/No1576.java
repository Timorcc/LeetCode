package String;

public class No1576 {
    public String modifyString(String s) {
        char[] res = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            if (res[i] == '?') {
                res[i] = 'a';
                while (i > 0 && res[i] == res[i - 1] || i < res.length - 1 && res[i] == res[i + 1]) {
                    res[i] += 1;
                }
            }
        }
        return new String(res);
    }
}
