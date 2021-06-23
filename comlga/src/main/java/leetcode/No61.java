package leetcode;

import java.util.Arrays;

/**
 * @author lga
 * @date 2021-04-09 13:35
 * @desc
 */
public class No61 {
    public boolean isStraight(int[] nums) {
        int joker = 0;
        Arrays.sort(nums);
        for (int i = 0; i < 4; i++) {
            if (nums[i] == 0) {
                joker++;
            } else {
                if (nums[i] == nums[i + 1]) {
                    return false;
                }
            }
        }
        return nums[4] - nums[joker] < 5;
    }
}
