package JzOffer;

/**
 * @author lga
 * @date 2020-12-14 15:17
 * @desc 输入一个链表，输出该链表中倒数第k个结点。
 */
public class No14 {
    public ListNode FindKthToTail(ListNode head, int k) {
        if (head == null) return null;
        ListNode p = head;
        ListNode q = head;
        for (int i = 0; i < k; i++) {
            if (p == null) return null;
            else {
                p = p.next;
            }
        }
        while (p != null) {
            p = p.next;
            q = q.next;
        }
        return q;
    }


    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }

    }
}
