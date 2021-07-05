package dp;

/**
 * @author lga
 * @date 2021-07-05 21:30
 * @desc 分割等和子集
 */
public class No416 {
    public boolean canPartition(int[] nums) {
        int len = nums.length;
        int sum = 0;
        for (int n : nums
        ) {
            sum += n;
        }
        if (sum % 2 != 0) {
            return false;
        }
        int W = sum / 2;
        int[] dp = new int[W + 1];
        dp[0] = 1;
        for (int num : nums) {
            for (int i = W; i >= num; i--) {
                dp[i] += dp[i-num];
            }
        }return dp[W] != 0;
    }
}
