package interview_coding;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class NonRepeatingChar {
    public static void main(String[] args) {
        String str = "techtalk";
        Map<Character, Integer> count = new LinkedHashMap<>();
        for (char ch : str.toCharArray()) {
            if (count.containsKey(ch)) {
                count.put(ch, count.get(ch) + 1);
            } else {
                count.put(ch, 1);
            }
        }
            for (Map.Entry<Character, Integer> entry : count.entrySet()) {
                if (entry.getValue() == 1) {
                    System.out.println(entry.getKey());
                    break;
                }
            }
        }
    }

