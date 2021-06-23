package JzOffer;

import java.util.Arrays;

/**
 * @author lga
 * @date 2021-06-01 21:31
 * @desc 重建二叉树
 */
public class No07 {

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int len = preorder.length;
        if (len == 0) return null;
        int rootVal = preorder[0], rootIndex = 0;
        for (int i = 0; i < len; i++) {
            if (inorder[i] == rootVal) {
                rootIndex = i;
                break;
            }
        }
        TreeNode root = new TreeNode(rootVal);

        root.left = buildTree(Arrays.copyOfRange(preorder, 1, 1 + rootIndex), Arrays.copyOfRange(inorder, 0, rootIndex));
        root.right = buildTree(Arrays.copyOfRange(preorder, 1 + rootIndex, len), Arrays.copyOfRange(inorder, 1 + rootIndex, len));
        return root;
    }
}
