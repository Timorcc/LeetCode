package ListNode;

/**
 * @author lga
 * @create 2020/9/17 0017
 * @desc 给你一个单链表的引用结点 head。链表中每个结点的值不是 0 就是 1。已知此链表是一个整数数字的二进制表示形式。
 * <p>
 * 请你返回该链表所表示数字的 十进制值 。
 * 输入：head = [1,0,1]
 * 输出：5
 * 解释：二进制数 (101) 转化为十进制数 (5)
 * 输入：head = [1,0,0,1,0,0,1,1,1,0,0,0,0,0,0]
 * 输出：18880
 * 输入：head = [0,0]
 * 输出：0
 **/
public class No1290 {
    public int getDecimalValue(ListNode head) {
        int count = 0;
        int sum = 0;
        ListNode cur = head;
        while (cur != null) {
            count++;
            cur = cur.next;
            ;
        }
        while (head != null) {
            if (head.val == 1) {
                sum += Math.pow(2, count - 1);
            }
            if (head.val == 0) {
            }
            head = head.next;
            count--;
        }
        return sum;
    }
}
