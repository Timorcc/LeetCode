package tree;

import com.sun.media.sound.RIFFReader;

/**
 * @author lga
 * @date 2021-06-24 22:11
 * @desc
 */
public class No116 {
    public Node connect(Node root) {
        if (root == null) {
            return null;
        }
        getRes(root.left, root.right);
        return root;
    }

    private void getRes(Node left, Node right) {
        if (left == null || right == null) {
            return;
        }
        left.next = right;
        getRes(left.left, left.right);
        getRes(right.left, right.right);
        getRes(left.right, right.left);
    }
}

class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {
    }

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
}