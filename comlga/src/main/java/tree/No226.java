package tree;

/**
 * @author lga
 * @date 2021-06-24 21:52
 * @desc 反转二叉树
 */
public class No226 {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        invertTree(root.left);
        invertTree(root.right);
        return root;
    }
}
