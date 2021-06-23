package JzOffer;

/**
 * @author lga
 * @date 2021-04-09 14:40
 * @desc
 */
public class No4 {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public TreeNode reConstructBinaryTree(int[] pre, int[] in) {
        TreeNode treeNode = reConstructBinaryTree(pre, 0, pre.length - 1, in, 0, in.length - 1);
        return treeNode;
    }

    public TreeNode reConstructBinaryTree(int[] pre, int startPre, int endPre, int[] in, int startIn, int endIn) {
        if (startPre > endPre || startIn > endIn) return null;
        TreeNode treeNode = new TreeNode(pre[startPre]);
        for (int i = startIn; i <= endIn; i++) {
            if (pre[startPre] == in[i]) {
                treeNode.left = reConstructBinaryTree(pre, startPre + 1, startPre + i - startIn, in, startIn, i - 1);
                treeNode.right = reConstructBinaryTree(pre, startPre + 1 + i - startIn, endPre, in, i + 1, endIn);
                break;
            }
        }
        return treeNode;
    }

}
