package Leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lga
 * @date 2020-12-28 22:43
 * @desc
 */
public class No1431 {
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> res = new ArrayList<>();
        if (candies.length == 0) return res;
        int max = candies[0];
        for (int i = 0; i < candies.length; i++) {
            max = Math.max(max, candies[i]);
        }
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] + extraCandies >= max)
                res.add(true);
            else
                res.add(false);
        }
        return res;
    }


}
