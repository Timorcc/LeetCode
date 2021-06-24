package tree;

/**
 * @author lga
 * @date 2021-06-24 22:21
 * @desc 二叉树展开为链表
 */
public class No114 {
    public void flatten(TreeNode root) {
        if (root==null){
            return;
        }
        flatten(root.left);
        flatten(root.right);
        TreeNode temp = root.right;
        root.right = root.left;
        TreeNode p = root;
        while (p.right != null) {
            p = p.right;
        }
        p.right = temp;
    }
}
