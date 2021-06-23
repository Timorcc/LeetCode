package JzOffer;

/**
 * @author lga
 * @date 2021-04-09 18:29
 * @desc
 */
public class No9 {
    public int jumpFloorII(int target) {
        if (target <= 0) return -1;
        else if (target == 1) return 1;
        else return 2 * jumpFloorII(target - 1);

    }
}
