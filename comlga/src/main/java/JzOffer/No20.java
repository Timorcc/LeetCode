package JzOffer;

import java.util.Stack;

/**
 * @author lga
 * @date 2021-04-09 21:22
 * @desc
 */
public class No20 {

    Stack<Integer> data = new Stack<>();
    Stack<Integer> min = new Stack<>();
    public void push(int node) {
        data.push(node);
        if (!min.isEmpty() && min.peek() < node) {
            min.push(min.peek());
        } else {
            min.push(node);
        }
    }
    public void pop() {
        if (!data.isEmpty()) {
            data.pop();
            min.pop();
        }
    }
    public int top() {
        return data.peek();

    }
    public int min() {
        return min.peek();
    }

}
