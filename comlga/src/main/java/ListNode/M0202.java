package ListNode;

import java.util.List;

/**
 * @author lga
 * @create 2020/9/17 0017
 * @desc 输入： 1->2->3->4->5 和 k = 2
 * 输出： 4
 **/
public class M0202 {
    public int kthToLast(ListNode head, int k) {
        ListNode end = head;
        for (int i = 0; i < k; i++) {
            end = end.next;
        }
        while (end != null) {
            head = head.next;
            end = end.next;
        }
        return head.val;
    }
}
