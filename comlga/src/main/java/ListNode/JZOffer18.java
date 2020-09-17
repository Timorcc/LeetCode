package ListNode;

import java.util.List;

/**
 * @author lga
 * @create 2020/9/17 0017
 * @desc 示例 1:
 * <p>
 * 输入: head = [4,5,1,9], val = 5
 * 输出: [4,1,9]
 * 解释: 给定你链表中值为 5 的第二个节点，那么在调用了你的函数之后，该链表应变为 4 -> 1 -> 9.
 * 示例 2:
 * <p>
 * 输入: head = [4,5,1,9], val = 1
 * 输出: [4,5,9]
 * 解释: 给定你链表中值为 1 的第三个节点，那么在调用了你的函数之后，该链表应变为 4 -> 5 -> 9.
 **/
public class JZOffer18 {
    public ListNode deleteNode(ListNode head, int val) {
        ListNode newNode1 = new ListNode(0, head);
        ListNode prev = newNode1;
        ListNode cur = head;
        while (cur != null) {
            if (cur.val == val) {
                prev.next=prev.next.next;
            }else {
                prev=prev.next;
            }
            cur = cur.next;
        }
        return newNode1.next;
    }
}
