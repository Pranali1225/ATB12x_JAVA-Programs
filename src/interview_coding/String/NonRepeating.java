package interview_coding.String;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

public class NonRepeating {
    public static void main(String[] args) {
        String input="Stress";
        input=input.toLowerCase(Locale.ROOT);
        Map<Character,Integer> count=new LinkedHashMap<>();
        for(char ch:input.toCharArray()){
            if(count.containsKey(ch)){
                count.put(ch,count.get(ch)+1);
            }else{
                count.put(ch,1);
            }
        }
        for(Map.Entry<Character,Integer> entry: count.entrySet()){
            if (entry.getValue()==1) {
                System.out.println(entry.getKey());
                break;
            }
        }

    }
}
