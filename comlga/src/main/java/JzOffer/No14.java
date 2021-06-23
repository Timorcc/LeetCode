package JzOffer;

import java.util.List;

/**
 * @author lga
 * @date 2021-04-09 19:44
 * @desc
 */
public class No14 {

    class ListNode {
        int val;
        ListNode next = null;

        public ListNode(int val) {
            this.val = val;
        }

        public ListNode FindKthToTail(ListNode pHead, int k) {

            if (pHead == null || k == 0) {
                return null;
            } else {
                ListNode fast = pHead;
                ListNode slow = pHead;
                for (int i = 1; i < k; i++) {
                    fast = fast.next;
                    if (fast == null) {
                        return null;
                    }
                }
                while (fast.next != null) {
                    fast = fast.next;
                    slow = slow.next;
                }
                return slow;
            }
        }


    }
}
