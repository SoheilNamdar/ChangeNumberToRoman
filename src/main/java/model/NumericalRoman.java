package model;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class NumericalRoman {
    public String change(int number) {

        String st = "";

        Map<Integer, String> map = new TreeMap<>(Collections.reverseOrder());
        map.put(10, "X");
        map.put(1, "I");
        map.put(5, "V");

        for (Map.Entry<Integer, String> pair : map.entrySet()) {
            while (number >= pair.getKey()){
                st += pair.getValue();
                number -= pair.getKey();
            }
        }

        return st;
    }
}
