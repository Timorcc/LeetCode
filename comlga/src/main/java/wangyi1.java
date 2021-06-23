import java.util.Stack;

/**
 * @author lga
 * @date 2021-04-18 16:16
 * @desc
 */
public class wangyi1 {
    public int getMatchBracketsNum(String inString, int inStringNum) {
        Stack stack = new Stack();
        int res = 0;
        for (int i = 0; i < inString.length(); i++) {
            char ch = inString.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }
            if (ch == ')' || ch == '}' || ch == ']') {
                if (!stack.isEmpty()) {
                    switch (ch) {
                        case ')': {
                            if ((char) stack.peek() == '(') {
                                stack.pop();
                                res += 1;
                            } else {
                                stack.push(ch);
                            }
                            break;
                        }
                        case ']': {
                            if ((char) stack.peek() == '[') {
                                stack.pop();
                                res += 2;
                            } else {
                                stack.push(ch);
                            }
                            break;
                        }
                        case '}': {
                            if ((char) stack.peek() == '{') {
                                stack.pop();
                                res += 2;
                            } else {
                                stack.push(ch);
                            }
                            break;
                        }
                    }
                }
            }
        }
        return res == 0 ? -1 : res;
    }
}
