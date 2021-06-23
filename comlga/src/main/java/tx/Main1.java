package tx;

import java.util.Stack;

/**
 * @author lga
 * @date 2021-04-14 16:21
 * @desc
 */
public class Main1 {
    class TreeNode {
        TreeNode left;
        TreeNode right;
    }

    public TreeNode reverseTreeNode(TreeNode root) {
        if (root == null) {
            return null;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.add(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            if (node.left != null) stack.add(node.left);
            if (node.right != null) stack.add(node.right);
            TreeNode temp = node.left;
            node.left = node.right;
            node.right = temp;
        }
        return root;

    }
}
