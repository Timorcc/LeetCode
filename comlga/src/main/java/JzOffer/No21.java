package JzOffer;

import java.util.Stack;

/**
 * @author lga
 * @date 2021-04-09 21:40
 * @desc 栈的合法弹出顺序
 */
public class No21 {
    public boolean IsPopOrder(int[] pushA, int[] popA) {
        if (popA.length == 0 || pushA.length == 0) {
            return false;
        }
        Stack<Integer> stack = new Stack<>();
        int index = 0;
        for (int i = 0; i < pushA.length; i++) {
            stack.push(pushA[i]);
            while (!stack.isEmpty() && stack.peek() == popA[index]) {
                stack.pop();
                index++;
            }
        }
        return stack.isEmpty();
    }

}
