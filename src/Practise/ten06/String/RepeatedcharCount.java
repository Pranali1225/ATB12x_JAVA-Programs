package Practise.ten06.String;

import java.util.HashMap;
import java.util.Map;

public class RepeatedcharCount {
    public static void main(String[] args) {
        String str="programming";
        Map<Character,Integer> charcount=new HashMap<>();
        for(char ch:str.toCharArray()){
            if(charcount.containsKey(ch)){
                charcount.put(ch,charcount.get(ch)+1);
            }else{
                charcount.put(ch,1);
            }
        }
        for(Map.Entry<Character,Integer>entry: charcount.entrySet()){
            if(entry.getValue()>1){
                System.out.println(entry.getKey() + " = "+ entry.getValue() );
            }
        }
    }
}
