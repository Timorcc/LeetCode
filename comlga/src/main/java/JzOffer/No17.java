package JzOffer;

/**
 * @author lga
 * @date 2021-04-09 20:06
 * @desc
 */
public class No17 {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    public boolean HasSubtree(TreeNode root1, TreeNode root2) {
        if (root1 == null || root2 == null) {
            return false;
        }
        if (root1.val == root2.val) {
            if (judge(root1, root2)) {
                return true;
            }
        }
        return HasSubtree(root1.left, root2) || HasSubtree(root1.right, root2);
    }

    private boolean judge(TreeNode root1, TreeNode root2) {
        if (root2 == null) {
            return true;
        }
        if (root1 == null) {
            return false;
        }
        if (root1.val == root2.val) {
            return judge(root1.left, root2.left) && judge(root1.right, root2.right);
        }
        return false;
    }
}
