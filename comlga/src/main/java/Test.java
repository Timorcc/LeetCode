import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(0,10);
        list.add(1,11);
        list.add(2,12);
        list.add(3,13);
        list.add(3,14);
        list.add(0,15);
        list.add(3,16);
        list.add(3,17);
        list.add(3,18);
        list.add(3,19);

        System.out.println(list);
    }
}
