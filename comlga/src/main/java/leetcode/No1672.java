package leetcode;

/**
 * @author lga
 * @date 2020-12-28 22:29
 * @desc
 */
public class No1672 {
    public static int maximumWealth(int[][] accounts) {

        int max = 0;
        int sum ;
        for (int i = 0; i < accounts.length; i++) {
            sum = 0;
            for (int j = 0; j < accounts[0].length; j++) {
                sum += accounts[i][j];
            }
            max = Math.max(sum,max);
        }
        return max;
    }

    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {3, 2, 1}};
        System.out.println(maximumWealth(arr));
    }
}
