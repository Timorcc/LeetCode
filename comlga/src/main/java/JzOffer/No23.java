package JzOffer;

/**
 * @author lga
 * @date 2021-04-09 22:12
 * @desc
 */
public class No23 {
    public boolean VerifySquenceOfBST(int[] sequence) {
        if (sequence == null || sequence.length == 0) return false;
        else return judge(sequence, 0, sequence.length - 1);

    }

    private boolean judge(int[] sequence, int start, int end) {
        if (start >= end) return true;
        int root = sequence[end];
        int i = start;
        while (sequence[i] < root) {
            i++;
        }
        int j = i;
        while (j < end) {
            if (sequence[j] < root) {
                return false;
            }
            j++;
        }
        boolean left = judge(sequence, start, i - 1);
        boolean right = judge(sequence, i, end - 1);
        return left && right;
    }

}