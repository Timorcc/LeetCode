package String;

public class No459 {
    public boolean repeatedSubstringPattern(String s) {
        //abab
        return (s + s).indexOf(s, 1) != s.length();
    }

}
