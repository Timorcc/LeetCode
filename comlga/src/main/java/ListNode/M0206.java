package ListNode;

import com.sun.corba.se.pept.transport.ReaderThread;

import java.util.ArrayList;
import java.util.List;

public class M0206 {
    public boolean isPalindrome(ListNode head) {
        List list = new ArrayList();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
        int size = list.size();
        int mid;

        switch (list.size() % 2) {
            case 0:
                mid = list.size() / 2;
                break;
            case 1:
                mid = list.size() / 2 + 1;
                break;
            default:
                mid = 0;
        }

        System.out.println(size);
        System.out.println(mid);
        for (int i = 0; i < mid; i++) {
            if (!list.get(i) .equals( list.get(size - i - 1))) {
                return false;
            }
        }
        return true;
    }
}
