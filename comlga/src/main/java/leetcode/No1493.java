package leetcode;

/**
 * @author lga
 * @date 2021-03-26 23:08
 * @desc
 */
public class No1493 {

    public static void main(String[] args) {
        int[] arr = new int[]{0, 1, 1, 1, 0, 1, 1, 0, 1};
        System.out.println(longestSubarray(arr));

    }

    public static int longestSubarray(int[] nums) {
        int slow = 0, fast = 0, zeroIndex = -1, res = 0;
        for (fast = 0; fast < nums.length; fast++) {
            if (nums[fast]== 0){
                if (zeroIndex != -1) {
                    res = Math.max(res, fast - slow - 1);
                    slow = zeroIndex + 1;
                }
                zeroIndex = fast;
            }
        }
        res = Math.max(res,fast-slow-1);
        return res;
    }
}
