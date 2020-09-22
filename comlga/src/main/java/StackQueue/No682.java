package StackQueue;

import java.util.Stack;

public class No682 {
    public int calPoints(String[] ops) {
        Stack<Integer> stack = new Stack<Integer>();
        int result = 0;
        for (String c : ops) {
            if (c.equals("C")) {
                stack.pop();
            } else if (c.equals("D")) {
                Integer x = stack.elementAt(stack.size() - 1);
                stack.push(x * 2);
            } else if (c.equals("+")) {
                Integer a = stack.elementAt(stack.size() - 1);
                Integer b = stack.elementAt(stack.size() - 2);
                stack.push(a + b);
            } else stack.push(Integer.valueOf(c));
        }
        for (Integer a : stack
        ) {

            result += a;
        }
        return result;
    }
}
