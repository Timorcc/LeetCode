package String;


import java.util.Stack;

/**
 * @author lga
 * @create 2020/10/4 0004
 * @desc 输入一个英文句子，翻转句子中单词的顺序，但单词内字符的顺序不变。为简单起见，标点符号和普通字母一样处理。例如输入字符串"I am a student. "，则输出"student. a am I"。
 **/
public class JzOffer58 {
    public String reverseWords(String s) {
//        s = s.trim();
//        Stack<String> stack = new Stack();
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < s.length(); i++
//        ) {
//            while (i + 1 < s.length() && s.charAt(i) == ' ' && s.charAt(i + 1) == ' ') {
//                i++;
//            }
//            sb.append(s.charAt(i));
//            if (i + 1 < s.length() && s.charAt(i + 1) == ' ') {
//                stack.push(sb.toString());
//                sb.delete(0, sb.length());
//            }
//        }
//        StringBuilder sb2 = new StringBuilder();
//        while (!stack.isEmpty()) {
//            sb2.append(stack.pop()+" ");
//        }
//        return sb2.toString();
        s = s.trim();
        int j = s.length() - 1, i = j;
        StringBuilder sb = new StringBuilder();
        while (i >= 0) {
            while (i >= 0 && s.charAt(i) != ' ') i--;
            sb.append(s.substring(i + 1, j + 1) + " ");
            while (i >= 0 && s.charAt(i) == ' ') i--;
            j = i;
        }
        return sb.toString().trim();

    }
}
