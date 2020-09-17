package ListNode;

import java.util.List;

/**
 * @author lga
 * @create 2020/9/17 0017
 * @desc 给定一个排序链表，删除所有重复的元素，使得每个元素只出现一次。
 * <p>
 * 示例 1:
 * <p>
 * 输入: 1->1->2
 * 输出: 1->2
 * 示例 2:
 * <p>
 * 输入: 1->1->2->3->3
 * 输出: 1->2->3
 **/
public class No83 {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null) return head;
        if (head.val==head.next.val && head.next.next==null) return head.next;
        ListNode prev = head;
        ListNode temp = prev.next;
        while (temp != null){
            if(prev.val == temp.val){
                prev.next=prev.next.next;
                temp = temp.next;
            }
            else {
                prev= prev.next;
                temp=temp.next;
            }
        }
        return  head;

    }
}
