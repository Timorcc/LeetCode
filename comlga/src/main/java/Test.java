import java.util.Arrays;

public class Test {
    public static void insertSort(int[] arr) {


        System.out.println(Arrays.toString(arr));
    }


    public static void main(String[] args) {
        int[] arr = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        insertSort(arr);

    }
}