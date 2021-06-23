package JzOffer;

/**
 * @author lga
 * @date 2021-04-09 18:27
 * @desc
 */
public class No8 {
    public int jumpFloor(int target) {
        if (target == 1) {
            return 1;
        }
        if (target == 2) {
            return 2;
        } else {
            return jumpFloor(target - 1) + jumpFloor(target - 2);
        }
    }
}
