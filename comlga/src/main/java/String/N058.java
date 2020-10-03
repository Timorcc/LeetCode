package String;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class N058 {
    public int lengthOfLastWord(String s) {

        if (s == "" || s == null) {
            return 0;
        }
        int result = 0;
        s=s.trim();
        for (int i = s.length()-1; i >=0 ; i--) {
            if(s.charAt(i)!=' '){
                result++;
            }else {
                break;
            }

        }
        return result;

    }
}
