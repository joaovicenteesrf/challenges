package Challenges;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UniqueNumber {

    public int uniqueNumber() {

        List<Integer> a = new ArrayList<>();

        a.add(10);
        a.add(20);
        a.add(10);
        a.add(20);
        a.add(30);
        a.add(40);
        a.add(40);

        Map<Integer, Integer> map = new HashMap<>();
        int lonelyInteger = 0;
        for (int number : a) {
            int val = 1;
            if (map.get(number) != null) {
                val = map.get(number);
                ++val;
            }
            map.put(number, val);
        }
        for (int key : map.keySet()) {
            if (map.get(key) == 1) {
                lonelyInteger = key;
            }
        }
        return lonelyInteger;

    }

}
