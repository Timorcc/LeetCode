package ListNode;

import java.util.Stack;

/**
 * @author lga
 * @create 2020/9/17 0017
 * @desc 请判断一个链表是否为回文链表。
 * 示例 1:
 * <p>
 * 输入: 1->2
 * 输出: false
 * 示例 2:
 * <p>
 * 输入: 1->2->2->1
 * 输出: true
 **/
public class No234 {
    public boolean isPalindrome(ListNode head) {
        Stack<ListNode> stack = new Stack<ListNode>();
        ListNode cur = head;
        while (cur != null) {
            stack.push(cur);
            cur = cur.next;
        }

        while (!stack.empty()){
            if (stack.pop().val==head.val){
                head=head.next;
            }
            else {
                return false;
            }
        }
        return true;
    }
}
