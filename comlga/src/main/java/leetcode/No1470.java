package leetcode;

/**
 * @author lga
 * @date 2021-05-12 21:45
 * @desc
 */
public class No1470 {
    public int[] shuffle(int[] nums, int n) {
        int[] temp = new int[nums.length];
        int j = 0;
        for (int i = 0; i < nums.length; i+=2) {
            temp[i]=nums[j++];
            temp[i+1]=nums[n++];
        }
        return temp ;
    }
}
