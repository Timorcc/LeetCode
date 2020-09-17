package ListNode;

import com.sun.org.apache.regexp.internal.RE;

import javax.xml.transform.Result;
import java.awt.*;
import java.util.ArrayList;
import java.util.Stack;

/**
 * @author lga
 * @create 2020/9/17 0017
 * @desc 输入：head = [1,3,2]
 * 输出：[2,3,1]
 **/
public class JZOffer06 {
    public int[] reversePrint(ListNode head) {
        ListNode temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            temp=temp.next;
        }
        int[] result = new int[count];
        temp = head;
        for (int i = count-1; i >= 0; i--){
            result[i] = head.val;
            head=head.next;
        }
        return result;
//        Stack<ListNode> stack = new Stack<ListNode>();
//        while (head != null){
//            stack.push(head);
//            head = head.next;
//        }
//
//        int[] result = new int[stack.size()];
//        for (int i = 0; i < stack.size(); i++){
//            result[i]=stack.pop().val;
//        }
//        return result;
//=======

//        ListNode p = null;
//        while (head != null) {
//            ListNode next = head.next;
//            head.next = p;
//            p = head;
//            head = next;
//        }
//        ArrayList<Integer> result = new ArrayList<Integer>();
//        int i = 0;
//        while (p != null) {
//            result.add(p.val);
//            i++;
//            p = p.next;
//        }
//        int[] temp = new int[result.size()];
//        for (int x = 0; x < result.size(); x++) {
//            temp[x] = (int) result.get(x);
//        }
//        return temp;
    }
}
