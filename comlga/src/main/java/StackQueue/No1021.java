package StackQueue;

public class No1021 {
    public String removeOuterParentheses(String S) {
        StringBuffer sb = new StringBuffer();
        int level = 0;
        for (char c : S.toCharArray()
        ) {
            if (c == ')') level--;
            if (level >= 1) sb.append(c);
            if (c == '(') level++;
        }
        return sb.toString();
    }
}
