package Practise.ten06.String;

import java.util.HashMap;
import java.util.Map;

public class OccuranceofCHAR {
    public static void main(String[] args) {
        String str="programming is key of sucess";
        Map<Character,Integer> charmap=new HashMap<>();
        char ch[]=str.toCharArray();
        for(char c:ch){
            if(charmap.containsKey(c)){
                charmap.put(c,charmap.get(c)+1);
            }else{
                charmap.put(c,1);
            }
        }
        System.out.println(charmap);
    }
}
