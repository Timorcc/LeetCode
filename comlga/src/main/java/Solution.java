

import java.util.Arrays;
import java.util.HashMap;

public class Solution {

    public static void main(String[] args) {
        int[] arr = new int[]{70, 15, 21, 96};
        int tar = 45;


        System.out.println(Arrays.toString(twoSum(arr, tar)));
    }


    public static int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        if (nums == null || nums.length <= 1) {
            return res;
        }
        //map中的key存放数组中的数字值，val存放对应数字在数组中的索引
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int val = target - num;
            if (map.containsKey(val)) {
                res[0] = i;
                res[1] = map.get(val);
                return res;
            } else {
                map.put(num, i);
            }
        }
        return res;
    }

}
