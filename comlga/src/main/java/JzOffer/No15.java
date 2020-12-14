package JzOffer;

/**
 * @author lga
 * @date 2020-12-14 15:44
 * @desc 输入一个链表，反转链表后，输出新链表的表头。
 */
public class No15 {

    public ListNode ReverseList(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode reverse = new ListNode(0);
        reverse.next = null;
        ListNode newNode;
        while (head != null) {
            newNode = head;
            head = head.next;

            newNode.next = reverse.next;
            reverse.next = newNode;
        }
        return reverse.next;
    }


    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
}
