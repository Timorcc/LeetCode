package wangyi;

import javax.xml.ws.spi.http.HttpHandler;
import java.util.HashMap;

/**
 * @author lga
 * @date 2021-04-10 15:15
 * @desc
 */
public class Wangyi1 {

    public int billsChange(int[] bills) {
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        map.put(5, 2);
        map.put(10, 0);
        for (int i = 0; i < bills.length; i++) {
            switch (bills[i]) {
                case 5:
                    map.put(5, map.get(5) + 1);
                    count++;
                    break;
                case 10:
                    if (map.get(5) > 0) {
                        count++;
                        map.put(10, map.get(10) + 1);

                        map.put(5, map.get(5) - 1);
                        break;
                    } else {
                        return count;
                    }
                case 20:
                    if (map.get(5) > 0 && map.get(10) > 0) {
                        count++;
                        map.put(5, map.get(5) - 1);
                        map.put(10, map.get(10) - 1);
                        break;
                    } else if (map.get(5) > 2) {
                        count++;
                        map.put(5,map.get(5)-3);
                    } else {
                        return count;
                    }
            }
        }
        return count;
    }
}
