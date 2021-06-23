package leetcode;

import java.util.Stack;

/**
 * @author lga
 * @date 2021-05-27 22:18
 * @desc
 */
public class No41 {
    public static String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        String[] items = path.split("/");
        for (String item :
                items) {
            if (item.isEmpty() || item.equals(".")) continue;
            if (item.equals("..")) {
                if (!stack.isEmpty()) stack.pop();
            } else {
                stack.push(item);
            }
        }
        return "/" + String.join("/", stack);
    }

    public static void main(String[] args) {
        String str = "/home";
        String[] split = str.split("/");
        for (String str1 :
                split) {
            System.out.println(str1);
        }
        System.out.println("-----------------");
        System.out.println("-----------------");
        System.out.println(simplifyPath(str));
    }
}
