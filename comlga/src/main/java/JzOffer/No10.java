package JzOffer;

/**
 * @author lga
 * @date 2020-12-23 9:35
 * @desc
 */
public class No10 {
    public int RectCover(int target) {
        if (target == 0 || target == 1 || target == 2)
            return target;
        else
            return RectCover(target - 1) + RectCover(target - 2);
    }
}
