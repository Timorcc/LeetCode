package StackQueue;

import java.util.HashMap;
import java.util.Stack;

public class No496 {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        Stack<Integer> stack = new Stack<Integer>();
        int[] result = new int[nums1.length];
        for (Integer a : nums2
        ) {
            while (!stack.empty() && a > stack.peek()) {
                map.put(stack.pop(), a);
            }
            stack.push(a);
        }
        while (!stack.empty()) {
            map.put(stack.pop(), -1);
        }

        for (int i = 0; i < nums1.length; i++) {
            result[i] = map.get(nums1[i]);
        }
        return result;
    }
}
