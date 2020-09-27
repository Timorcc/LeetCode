package StackQueue;

import javafx.scene.shape.ClosePathBuilder;

import java.util.Stack;

public class M0302 {
    class MinStack {

        Stack<Integer> A, B;

        /**
         * initialize your data structure here.
         */
        public MinStack() {
            A = new Stack<Integer>();
            B = new Stack<Integer>();
        }

        public void push(int x) {
            A.push(x);
            if (B.isEmpty() || B.peek() >= x)
                B.push(x);
        }

        public void pop() {
            if(A.pop().equals(B.peek()))
                B.pop();
        }

        public int top() {
            return A.peek();
        }

        public int min() {
            return B.peek();
        }
    }
}