package JzOffer;

/**
 * @author lga
 * @date 2020-12-14 15:48
 * @desc
 */
public class No25 {
    public RandomListNode Clone(RandomListNode pHead) {
        if (pHead == null || pHead.next == null) return pHead;

        RandomListNode res = new RandomListNode(pHead.label);
        res.next = null;
        res.random = null;

        RandomListNode now = res;

        while (pHead != null) {
            RandomListNode nextNode = null;
            RandomListNode randomNode = null;
            if (pHead.next != null) {
                nextNode = new RandomListNode(pHead.next.label);
            }
            if (pHead.random != null) {
                randomNode = new RandomListNode(pHead.random.label);
            }
            now.next = nextNode;
            now.random = randomNode;
            pHead = pHead.next;
            now = now.next;
        }
        return res;
    }


    public class RandomListNode {
        int label;
        RandomListNode next = null;
        RandomListNode random = null;

        RandomListNode(int label) {
            this.label = label;
        }
    }

}
