package ListNode;

import javax.swing.text.EditorKit;
import java.util.List;

/**
 * @author lga
 * @create 2020/9/17 0017
 * @desc 将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。 
 * <p>
 * 示例：
 * <p>
 * 输入：1->2->4, 1->3->4
 * 输出：1->1->2->3->4->4
 **/
public class No21 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0, null);
        ListNode end =head;
        while (l1 != null && l2 != null){
            if(l1.val<= l2.val){
                end.next=l1;
                end= end.next;
                l1=l1.next;

            }else {
                end.next = l2;
                end= end.next;
                l2=l2.next;

            }
        }
        if(l1==null) end.next=l2;
        if(l2==null) end.next=l1;
        return head.next;
    }
}
