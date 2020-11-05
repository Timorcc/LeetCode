package oters;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class No11 {
    public static int maxArea(int[] height) {
        List<Integer> list = new ArrayList();
        for (int i = 0; i < height.length - 1; i++) {
            for (int j = i + 1; j < height.length; j++) {
                int size = (j - i) * Math.min(height[i], height[j]);
                list.add(size);
            }
        }
        Collections.sort(list);
        System.out.println(list);
        return list.get(list.size() - 1);


    }

    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(maxArea(arr1));
    }
}
