import java.util.Scanner;

/**
 * @author lga
 * @date 2021-03-26 19:50
 * @desc
 */
public class Test2 {

    public static void main(String[] args) {

        System.out.println(F(4));

    }

    public static int F(int i) {
        if (i == 1) {
            return 1;
        }
        if (i == 2) {
            return 2;
        } else {
            return F(i - 1) + F(i - 2);
        }

    }

}

