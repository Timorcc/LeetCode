package ListNode;



public class JZOffer22 {
    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode end = head;
        for (int i = 0; i < k; i++) {
            end = end.next;
        }
        while (end != null){
            head=head.next;
            end = end.next;
        }
        return head;
    }
}
