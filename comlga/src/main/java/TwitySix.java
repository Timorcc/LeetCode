import java.util.Arrays;

public class TwitySix {

    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        } else {
            int cur = nums[0];
            int count = 1;
            int j = 1;
            for (int i = 1; i < nums.length; i++) {
                if (cur < nums[i]) {
                    cur = nums[i];
                    count++;
                    nums[j]=nums[i];
                    j++;
                }
            }

            return count ;
        }
    }

    public static void main(String[] args) {
        int[] arr1 = new int[]{0,0,1,1,1,2,2,3,3,4};
        int result1 = removeDuplicates(arr1);
        System.out.println(result1);
        System.out.println(Arrays.toString(arr1));
    }
}
