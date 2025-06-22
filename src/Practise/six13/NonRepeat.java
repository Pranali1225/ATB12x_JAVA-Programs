package Practise.six13;

import java.util.LinkedHashMap;
import java.util.Map;

public class NonRepeat {
    public static void main(String[] args) {
        String str="automation";
        Map<Character,Integer> count=new LinkedHashMap<>();
        for(char ch:str.toCharArray()){
            count.put(ch,count.getOrDefault(ch,0)+1);

        }
        for(Map.Entry<Character,Integer> entry:count.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println(entry.getKey());
                return;
            }
        }
        }
    }


