package StackQueue;

public class No496BaoLi {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length];
        int loop = 0;
        for (int a1 : nums1
        ) {
            int index = 0;
            for (int a2 : nums2
            ) {
                if (a1 == a2) {
                    break;
                } else
                    index++;
            }
            boolean flag=false;
            for (int i = index; i < nums2.length; i++) {
                flag = false;
                if (nums2[index] > a1) {
                    result[loop] = nums2[index];
                    flag=true;
                    break;
                }
            }
            if(flag==false){
                result[loop] = -1;
            }
            loop++;
        }
        return result;
    }
}
