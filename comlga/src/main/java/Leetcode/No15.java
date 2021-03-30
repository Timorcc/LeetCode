package Leetcode;

import java.util.*;

/**
 * @author lga
 * @date 2021-03-01 21:30
 * @desc
 */
public class No15 {
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        int length = nums.length;
        if (length < 3) return null;
        Arrays.sort(nums);

        for (int i = 0; i < length; i++) {
            if (nums[i] > 0) return res;
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            int cur = nums[i];
            int L = i + 1, R = length - 1;
            while (L < R) {
                int temp = cur + nums[L] + nums[R];
                if (temp == 0) {
                    List<Integer> list = new ArrayList<>();
                    list.add(cur);
                    list.add(nums[L]);
                    list.add(nums[R]);
                    res.add(list);
                    while (L < R && nums[L + 1] == nums[L]) L++;
                    while (L < R && nums[R - 1] == nums[R]) R--;
                    L++;
                    R--;
                } else if (temp < 0) {
                    L++;
                } else {
                    R--;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        System.out.println(threeSum(nums));
    }
}
