import java.util.HashMap;
import java.util.Stack;

public class Test extends Thread{


    public static String code(String arr)  {
        if (arr == null || arr.length() <= 1) return arr;
        Stack<Character> stack = new Stack();
        for (int i = 0; i < arr.length(); i++) {
            if (stack.isEmpty()) {
                stack.push(arr.charAt(i));
            } else if (stack.peek() == arr.charAt(i)) {
                stack.pop();
            } else stack.push(arr.charAt(i));
        }
        StringBuffer res = new StringBuffer();
        while (!stack.isEmpty()) {
            res.append(stack.pop());
        }
        return res.reverse().toString();
    }

    public static void main(String[] args) {
        String test = "abbaca";
        String res = code(test);
        System.out.println(res);


    }
}