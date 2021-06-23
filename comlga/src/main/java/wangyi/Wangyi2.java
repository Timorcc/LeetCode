package wangyi;

import org.omg.PortableServer.LIFESPAN_POLICY_ID;

/**
 * @author lga
 * @date 2021-04-10 15:42
 * @desc
 */
public class Wangyi2 {
    public class ListNode {
        int val;
        ListNode next = null;

        public ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode minusList(ListNode minuendList, ListNode subtrahendList) {
        // write code here
        if (subtrahendList == null) {
            return minuendList;
        } else if (minuendList == null) {
            if (subtrahendList.val <= 0) {
                subtrahendList.val = -subtrahendList.val;

            } else {
                ListNode p = subtrahendList.next;
                while (p != null) {
                    p.val = -p.val;
                    p = p.next;
                }
            }
            return subtrahendList;


        } else {
            if (minuendList.val >= 0 && subtrahendList.val <= 0) {
                subtrahendList.val = -subtrahendList.val;
                ListNode l1 = reverseNode(minuendList);
                ListNode l2 = reverseNode(subtrahendList);
                return addTwoNumbers(l1, l2);
            } else {
                if (minuendList.val < 0) {
                    minuendList.val = -minuendList.val;
                }
                if (subtrahendList.val < 0) {
                    subtrahendList.val = -subtrahendList.val;
                }
                ListNode l1 = reverseNode(minuendList);
                ListNode l2 = reverseNode(subtrahendList);
                int lengt1 = 0;
                int lengt2 = 0;
                ListNode a = minuendList;
                ListNode b = subtrahendList;
                while (a != null) {
                    lengt1++;
                    a = a.next;
                }
                while (b != null) {
                    lengt2++;
                    b = b.next;
                }

                if (lengt1 < lengt2) {
                    ListNode res = subTwoNumbers(l2, l1);
                    ListNode p = res;
                    while (p != null) {
                        p.val = -p.val;
                        p = p.next;
                    }
                    return res;
                } else {
                    ListNode res = subTwoNumbers(l2, l1);
                    ListNode p = res;
                    while (p != null) {
                        p.val = -p.val;
                        p = p.next;
                    }
                    return res;
                }

            }
        }
    }


    public ListNode reverseNode(ListNode node) {
        ListNode p = null;
        while (node != null) {
            ListNode next = node.next;
            node.next = p;
            p = node;
            node = next;
        }
        return p;
    }


    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode prev = head;
        int carry = 0;
        while (l1 != null || l2 != null || carry != 0) {
            int sum = (l1 != null ? l1.val : 0) + (l2 != null ? l2.val : 0) + carry;
            carry = sum / 10;
            prev.next = new ListNode(sum % 10);
            prev = prev.next;
            l1 = l1 != null ? l1.next : l1;
            l2 = l2 != null ? l2.next : l2;

        }
        return reverseNode(head.next);
    }

    //l1-l2
    public ListNode subTwoNumbers(ListNode l1, ListNode l2) {
        //l2 取相反数
        ListNode p = l2;
        while (p != null) {
            p.val = -p.val;
            p = p.next;
        }

        return addTwoNumbers(l1, l2);

    }

}
