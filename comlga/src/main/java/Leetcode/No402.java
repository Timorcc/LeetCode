package Leetcode;

import java.util.Stack;

/**
 * @author lga
 * @date 2020-12-26 11:33
 * @desc
 */
public class No402 {
    public static String removeKdigits(String num, int k) {
        if (num.length() == k) return "0";
        Stack<Character> stack = new Stack();
        int i = 0;
        for (int j = 0; j <= k; j++) {
            if (num.charAt(i) <= num.charAt(i + 1)) {
                stack.push(num.charAt(i));

            } else {
                stack.push(num.charAt(i + 1));
            }
            i=+2;
        }
        StringBuffer stringBuffer = new StringBuffer();
        while (!stack.isEmpty()) {
            stringBuffer.append(stack.pop());
        }
        return stringBuffer.reverse().toString();
    }

    public static void main(String[] args) {
        String num = "1432219";
        int len = 3;
        System.out.println(removeKdigits(num,len));
    }
}
