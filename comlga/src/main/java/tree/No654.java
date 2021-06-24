package tree;

import sun.reflect.generics.tree.Tree;

import java.util.Arrays;

/**
 * @author lga
 * @date 2021-06-24 22:34
 * @desc
 */
public class No654 {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return getRes(nums, 0, nums.length - 1);
    }

    public TreeNode getRes(int[] nums, int left, int right) {
        if (left > right) {
            return null;
        }
        int index = left, maxVal = nums[left];
        for (int i = left + 1; i <= right; i++) {
            if (maxVal < nums[i]) {
                index = i;
                maxVal = nums[i];
            }
        }
        TreeNode node = new TreeNode(maxVal);
        node.left = getRes(nums, left, index - 1);
        node.right = getRes(nums, index + 1, right);
        return node;
    }
}
