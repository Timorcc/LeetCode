package ListNode;

import ListNode.ListNode;


public class No237 {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}