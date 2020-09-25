package StackQueue;

import java.util.Stack;

public class No844 {

    public static boolean backspaceCompare(String S, String T) {
        Stack<Character> stack1 = new Stack<Character>();
        Stack<Character> stack2 = new Stack<Character>();

        for (char c1 : S.toCharArray()
        ) {
            if (c1 == '#') {
                if (!stack1.isEmpty()) {
                    stack1.pop();
                }

            } else stack1.push(c1);
        }
        for (char c2 : T.toCharArray()
        ) {
            if (c2 == '#') {
                if (!stack2.isEmpty()) {
                    stack2.pop();
                }
            } else stack2.push(c2);
        }
        return stack1.equals(stack2);
    }

    public static void main(String[] args) {
        backspaceCompare(
                "ab#c", "ad#c");
    }
}
