package JzOffer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lga
 * @date 2021-04-09 14:22
 * @desc
 */
public class No3 {
    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }

    }

    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ListNode p = null;
        while (listNode != null) {
            ListNode next = listNode.next;
            listNode.next = p;
            p = listNode;
            listNode = next;
        }
        ArrayList<Integer> res = new ArrayList<>();
        while (p != null) {
            res.add(p.val);
            p = p.next;
        }
        return res;
    }
}
