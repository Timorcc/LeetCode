package JzOffer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lga
 * @date 2020-12-14 14:11
 * @desc 输入一个链表，按链表从尾到头的顺序返回一个ArrayList。
 */
public class No3 {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> list = new ArrayList();
        while (listNode != null) {
            list.add(0, listNode.val);
            listNode = listNode.next;
        }
        return list;
    }


    class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
}
