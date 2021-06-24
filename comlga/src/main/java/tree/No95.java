package tree;

import sun.reflect.generics.tree.Tree;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lga
 * @date 2021-06-23 22:49
 * @desc 不同的二叉搜索树
 */
public class No95 {
    public List<TreeNode> generateTrees(int n) {
        if (n == 0) {
            return new ArrayList<TreeNode>();
        }
        return getRes(1, n);
    }

    public static List<TreeNode> getRes(int low, int high) {
        List<TreeNode> res = new ArrayList<>();
        if (low > high) {
            res.add(null);
            return res;
        }
        for (int i = low; i <= high; i++) {
            List<TreeNode> left = getRes(low, i - 1);
            List<TreeNode> right = getRes(i + 1, high);
            for (TreeNode leftNode : left) {
                for (TreeNode rightNode : right) {
                    TreeNode node = new TreeNode(i, null, null);
                    node.left = leftNode;
                    node.right = rightNode;
                    res.add(node);
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        getRes(1,3);
    }
}