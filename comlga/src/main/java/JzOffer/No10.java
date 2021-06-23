package JzOffer;

/**
 * @author lga
 * @date 2021-04-09 18:51
 * @desc
 */
public class No10 {
    public int rectCover(int target) {
        if (target < 1) return 0;
        if (target == 1) return 1;
        if (target == 2) return 2;
        else return rectCover(target - 1) + rectCover(target - 2);
    }

}
