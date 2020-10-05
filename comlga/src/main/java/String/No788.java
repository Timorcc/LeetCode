package String;

public class No788 {
    public int rotatedDigits(int N) {
        int count = 0;
        for (int i = 2; i <= N; i++) {
            String s = String.valueOf(i);
            s = s.replaceAll("[+0,+1,+8]", "");
            if (!"".equals(s)) {
                s = s.replaceAll("[+2,+5,+6,+9]", "");
                if ("".equals(s)) {
                    count += 1;
                }
            }
        }

        return count;
    }
}
