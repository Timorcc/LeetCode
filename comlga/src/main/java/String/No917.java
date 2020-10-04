package String;

import java.util.Stack;

/**
 * @author lga
 * @create 2020/10/4 0004
 * @desc 给定一个字符串 S，返回 “反转后的” 字符串，其中不是字母的字符都保留在原地，而所有字母的位置发生反转。
 * "[a-zA-Z]+"
 **/
public class No917 {
    public String reverseOnlyLetters(String S) {
        Stack stack = new Stack();
        for (char c : S.toCharArray()
        ) {
            if (Character.isLetter(c)) {
                stack.push(c);
            }
        }
        StringBuilder sb = new StringBuilder();
        for (char c : S.toCharArray()
        ) {
            if (Character.isLetter(c)) {
                sb.append(stack.pop());
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
