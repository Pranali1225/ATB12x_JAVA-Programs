package interview_coding;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicateFromArray {
    public static void main(String[] args) {
        int[] input={2,3,4,5,3,2,6};
        Map<Integer,Integer> count=new HashMap<>();
        for (int sr:input){
            if(count.containsKey(sr)){
                count.put(sr,count.get(sr)+1);
            }else{
                count.put(sr,1);
            }
        }
        for(Map.Entry<Integer,Integer>entrySet:count.entrySet()){
            if(entrySet.getValue()>1){
                System.out.println(entrySet.getKey());
            }
        }
    }
}
