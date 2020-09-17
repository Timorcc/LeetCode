package ListNode;

import java.util.List;

/**
 * @author lga
 * @create 2020/9/17 0017
 * @desc 删除链表中等于给定值 val 的所有节点。
 * <p>
 * 示例:
 * <p>
 * 输入: 1->2->6->3->4->5->6, val = 6
 * 输出: 1->2->3->4->5
 **/
public class No203 {
    public ListNode removeElements(ListNode head, int val) {
//      构造头结点
        ListNode newhead = new ListNode(0, head);
        ListNode prev = newhead;
        ListNode cur = head;
        while (cur != null) {
            if (cur.val == val) {
                prev.next = prev.next.next;
            } else {
                prev = prev.next;
            }
            cur = cur.next;
        }
        return newhead.next;

    }
}

