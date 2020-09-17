public class ThirtyEight {
    private String string;
    /*
    *   1.     1
        2.     11
        3.     21
        4.     1211
        5.     111221
    * */

    public static String countAndSay(int n) {
        String s = "";
        int p1 = 0;
        int cur = 1;
        if ( n == 1 )
            return "1";
        String str = countAndSay(n - 1);//21
        for ( cur = 1; cur < str.length(); cur++ ) {
            if ( str.charAt(p1) != str.charAt(cur) ) {
                int count = cur - p1;
                s = s + count + ""+str.charAt(p1);
                p1 = cur;
            }
        }
        if ( p1 != cur ){
            int count = cur - p1;
            s = s + count +""+ str.charAt(p1);
        }
        return s;
    }
    public static void main(String[] args) {

        System.out.println(countAndSay(4));

    }
}
