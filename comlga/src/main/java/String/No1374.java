package String;

public class No1374 {
    public String generateTheString(int n) {

        StringBuffer sb = new StringBuffer();
        if (n % 2 == 1) {
            for (int i = 0; i < n; i++) {
            sb.append('a');
            }

        }else {
            sb.append('a');
            for (int i = 1; i < n; i++){
                sb.append('b');
            }
        }
        return sb.toString();
    }
}
