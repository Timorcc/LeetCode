package String;

import java.util.HashMap;

public class No344 {
    public void reverseString(char[] s) {
        HashMap
        if (s.length < 2) {
            for (int i = 0, j = s.length - 1; i < j; i++, j--) {
                char temp = s[i];

                s[i] = s[j];
                s[j] = temp;
            }
        }
    }

}