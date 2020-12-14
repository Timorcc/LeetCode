package JzOffer;

import java.util.List;

/**
 * @author lga
 * @date 2020-12-13 16:49
 * @desc 在一个排序的链表中，存在重复的结点，请删除该链表中重复的结点，重复的结点不保留，返回链表头指针。
 * 例如，链表1->2->3->3->4->4->5 处理后为 1->2->5
 */
public class No56 {
    public ListNode deleteDuplication(ListNode pHead) {
        if (pHead == null || pHead.next == null) { // 只有0个或1个结点，则返回
            return pHead;
        }
        //构造头节点
        ListNode headNode = new ListNode(0);
        headNode.next = pHead;
        ListNode pre = headNode;
        ListNode last = pHead;
        while (last != null) {
            if (last.next != null && last.val == last.next.val) {
                while (last.next != null && last.val == last.next.val) {
                    last = last.next;
                }
                pre.next = last.next;
                last = last.next;
            }else {
                pre = pre.next;
                last = last.next;
            }
        }
        return headNode.next;
    }

    class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
}
