package Leetcode;

/**
 * @author lga
 * @date 2020-12-26 11:14
 * @desc
 */
public class No376 {
    public static int wiggleMaxLength(int[] nums) {

        if (nums == null || nums.length == 0) return 0;
        int up = 1;
        int down = 1;
        for (int k = 0; k < nums.length - 1; k++) {
            if (nums[k + 1] > nums[k]) {
                up = down + 1;
            }
            if (nums[k + 1] < nums[k]) {
                down = up + 1;
            }
        }
        return Math.max(up, down);
    }

    public static void main(String[] args) {
        int[] test = {1, 7, 4, 9, 2, 5};
        int[] test2 = {1, 17, 5, 10, 13, 15, 10, 5, 16, 8};
        int[] test3 = {};
        int[] test4 = {1};
        int[] test5 = {1, 2};
//        System.out.println(wiggleMaxLength(test));
//        System.out.println(wiggleMaxLength(test2));
        System.out.println(wiggleMaxLength(test3));
        System.out.println(wiggleMaxLength(test4));
        System.out.println(wiggleMaxLength(test5));
    }
}
