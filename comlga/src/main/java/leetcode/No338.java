package leetcode;

/**
 * @author lga
 * @date 2021-06-03 22:16
 * @desc
 */
public class No338 {
    public  static  int[] countBits(int n) {
        int[] res = new int[n+1];
        for(int i=0;i<n;i++){
            res[i] = getOneNum(i);
        }
        return res;
    }
    public  static int getOneNum(int n){
        int sum = 0;
        while(n!=0){
            n=n & (n-1);
            sum++;
        }
        return sum;
    }

    public static void main(String[] args) {
        countBits(2);
    }
}
