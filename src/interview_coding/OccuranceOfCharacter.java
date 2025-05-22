package interview_coding;

import java.util.HashMap;
import java.util.Map;

public class OccuranceOfCharacter {
    public static void main(String[] args) {
        String str="pranali";
        Map<Character,Integer> count=new HashMap<>();
        for(char ch:str.toCharArray()){
            if(count.containsKey(ch)){
                count.put(ch,count.get(ch)+1);
            }else{
                count.put(ch,1);
            }
        }
        for(Map.Entry<Character,Integer> entry:count.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
