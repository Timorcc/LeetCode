package JzOffer;

/**
 * @author lga
 * @date 2021-06-01 21:21
 * @desc
 */
public class No10II {
    public int numWays(int n) {
        if (n <= 1) return 1;
        if (n == 2) return 2;
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++) {
            dp[i] = (dp[i - 1] + dp[i - 2]) % 1000000007;
        }
        return dp[n];
    }
}
