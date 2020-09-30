package String;

public class No859 {
    public boolean buddyStrings(String A, String B) {
        if (A.length() != B.length()) {
            return false;
        }
        //aa ab
        String s = "aaa";


        int count = 0;
        boolean flag = true;
        for (int i = 0; i < A.length(); i++) {
            if (A.charAt(i) != B.charAt(i)) {
                count++;
            }
            if (A.charAt(i) != A.charAt(0)) {
                flag = false;
            }
        }
        if (A.equals(B)) {
            return flag;
        }
        return count == 2;
    }
}
