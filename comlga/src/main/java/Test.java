

/**
 * @author Admin
 */

public class Test {
    public static void main(String[] args) {
        int [] arr = new int[]{7,8,9,4,5,6,8,5,2,3,1};
        sort(arr,0, arr.length-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void sort(int[] arr, int low, int high) {
        if (low > high) {
            return;
        }
        int i = low, j = high, temp = arr[low];
        while (i < j) {
            while (i < j && arr[j] >= temp) j--;
            while (i < j && arr[i] <= temp) i++;
            if (i<j){
                int t = arr[i];
                arr[i] = arr[j];
                arr[j] = t;
            }
        }
        arr[low] = arr[i];
        arr[i] = temp;
        sort(arr,low,i-1);
        sort(arr,i+1,high);

    }

}
