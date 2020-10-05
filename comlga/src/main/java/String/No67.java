package String;

public class No67 {
    public String addBinary(String a, String b) {

        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        StringBuilder sb = new StringBuilder();
        while (i >= 0 && j >= 0) {
            int sum = carry;
            sum += a.charAt(i--) - '0';
            sum += b.charAt(j--) - '0';
            carry = sum / 2;
            sb.append(sum % 2);
        }
        while (i >= 0) {
            int sum = carry + a.charAt(i--) - '0';
            carry = sum / 2;
            sb.append(sum % 2);
        }
        while (j >= 0) {
            int sum = carry + a.charAt(j--) - '0';
            carry = sum / 2;
            sb.append(sum % 2);
        }
        if (carry == 1) {
            sb.append(carry);
        }
        return sb.toString();
    }
}