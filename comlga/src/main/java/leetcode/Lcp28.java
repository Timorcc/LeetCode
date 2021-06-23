package leetcode;

import java.util.Arrays;

/**
 * @author lga
 * @date 2021-05-12 21:24
 * @desc
 */
public class Lcp28 {
    public int purchasePlans(int[] nums, int target) {
        int mod = 1_000_000_007;
        Arrays.sort(nums);
        int left = 0, right = nums.length - 1;
        int ans = 0;
        while (left < right) {
            if (nums[left] + nums[right] > target) {
                right--;
            } else {
                ans += right - left;
                left++;
            }
            ans %= mod;
        }
        return ans % mod;
    }

}
