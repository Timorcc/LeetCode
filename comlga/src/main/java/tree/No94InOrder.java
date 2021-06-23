package tree;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lga
 * @date 2021-06-23 22:41
 * @desc 中序遍历
 */
public class No94InOrder {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        res = getResFromInOrder(root, res);
        return res;
    }

    public List<Integer> getResFromInOrder(TreeNode node, List list) {
        if (node == null) {
            return null;
        }
        getResFromInOrder(node.left, list);
        list.add(node.val);
        getResFromInOrder(node.right, list);
        return list;
    }
}
