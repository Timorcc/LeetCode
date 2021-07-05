package ListNode;

/**
 * @author lga
 * @date 2021-07-01 21:59
 * @desc
 */
public class No2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode root = new ListNode(0);
        ListNode cur = root;
        int flag = 0;
        while (l1 != null || l2 != null || flag != 0) {
            int num1 = l1 == null ? 0 : l1.val;
            int num2 = l2 == null ? 0 : l2.val;
            int sum = num1 + num2 + flag;
            flag = sum / 10;
            ListNode node = new ListNode(sum % 10);
            cur.next = node;
            cur = node;
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;

        }
        return root.next;
    }
}
