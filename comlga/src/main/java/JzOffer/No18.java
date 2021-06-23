package JzOffer;

/**
 * @author lga
 * @date 2021-04-09 20:49
 * @desc
 */
public class No18 {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;
        }
    }


    public TreeNode Mirror(TreeNode pRoot) {
        if (pRoot == null) {
            return pRoot;
        }
        if (pRoot.left == null && pRoot.right == null) {
            return pRoot;
        }
        TreeNode temp = pRoot.left;
        pRoot.left = pRoot.right;
        pRoot.right = temp;

        Mirror(pRoot.left);
        Mirror(pRoot.right);
        return pRoot;
    }
}
