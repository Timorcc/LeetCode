package String;

public class JzOffer58II {
    public String reverseLeftWords(String s, int n) {
        return s.substring(n, s.length() - 1) + s.substring(0, n - 1);
    }
}
