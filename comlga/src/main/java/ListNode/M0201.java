package ListNode;

import java.util.HashSet;
import java.util.Set;

public class M0201 {
    public ListNode removeDuplicateNodes(ListNode head) {

        if(head == null || head.next == null) return head;
        Set set = new HashSet();
        ListNode prev = head;
        ListNode temp = prev.next;
        set.add(head.val);
        while (temp != null) {
           if (set.contains(temp.val)){
               prev.next = prev.next.next;
               temp = temp.next;
           }else {
               set.add(temp.val);
               prev = prev.next;
                temp= temp.next;
           }

        }
        return head;
    }
}
