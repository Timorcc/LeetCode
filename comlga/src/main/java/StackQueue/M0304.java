package StackQueue;

import java.util.Stack;

public class M0304 {

    class MyQueue {
        Stack<Integer> stackWrite;
        Stack<Integer> stackRead;

        public MyQueue() {
            stackWrite = new Stack<Integer>();
            stackRead = new Stack<Integer>();
        }

        public void push(int x) {
            stackWrite.push(x);
        }

        public int pop() {
            peek();
            return stackRead.pop();
        }

        public int peek() {
            if (!stackRead.isEmpty()) {
                return stackRead.peek();
            }
            while (!stackWrite.isEmpty()) {
                stackRead.push(stackWrite.pop());
            }
            return stackRead.peek();
        }

        public boolean empty() {
            return stackWrite.isEmpty() && stackRead.isEmpty();
        }
    }
}