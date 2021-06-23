package leetcode;


import java.util.*;

/**
 * @author lga
 * @date 2021-05-17 22:23
 * @desc dfs bfs
 */
public class No993 {
    int x;
    int xDepth;
    TreeNode xParent;
    boolean xFalg;
    int y;
    int yDepth;
    TreeNode yParent;
    boolean yFalg;

    public boolean isCousins(TreeNode root, int x, int y) {
        this.x = x;
        this.y = y;
        Stack<Integer> stack = new Stack<>();

        Queue<TreeNode> nodeQueue = new LinkedList<TreeNode>();
        Queue<Integer> depthQueue = new LinkedList<>();
        List list = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        nodeQueue.offer(root);
        depthQueue.offer(0);
        update(root,0, null);
        while (!nodeQueue.isEmpty()){
            TreeNode curNode = nodeQueue.poll();
            int curDepth = depthQueue.poll();
            if (curNode.left!=null){
                nodeQueue.offer(curNode.left);
                depthQueue.offer(curDepth+1);
                update(curNode.left,curDepth+1,curNode);
            }            if (curNode.right!=null){
                nodeQueue.offer(curNode.right);
                depthQueue.offer(curDepth+1);
                update(curNode.right,curDepth+1,curNode);
            }
            if (xFalg && yFalg) {
                break;
            }
        }
        return xDepth == yDepth && xParent!=yParent;

    }
    public void update(TreeNode node ,int depth,TreeNode parent){
        if (node.val ==x ){
            xDepth = depth;
            xParent = parent ;
            xFalg = true;
        }        if (node.val ==y ){
            yDepth = depth;
            yParent = parent ;
            yFalg = true;
        }
    }





}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}