package JzOffer;

/**
 * @author lga
 * @date 2021-04-09 19:51
 * @desc
 */
public class No15 {
    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode ReverseList(ListNode head) {
        if (head == null) {
            return null;
        } else {
            ListNode p = null;
            while (head != null) {
                ListNode next = head.next;
                head.next = p;
                p = head;
                head = next;
            }
            return p;
        }
    }
}
