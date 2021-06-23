package JzOffer;

/**
 * @author lga
 * @date 2021-04-09 19:53
 * @desc
 */
public class No16 {

    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode Merge(ListNode list1, ListNode list2) {
        ListNode head = new ListNode(0);
        ListNode temp = head;
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                ListNode p = list1;
                temp.next = p;
                temp = temp.next;
                list1 = list1.next;
            } else {
                ListNode p = list2;
                temp.next = p;
                temp = temp.next;
                list2 = list2.next;
            }
        }
        while (list1 != null) {
            temp.next = list1;
            temp = temp.next;
            list1 = list1.next;
        }
        while (list2 != null) {
            temp.next = list2;
            temp = temp.next;
            list2 = list2.next;
        }
        return head.next;
    }
}
