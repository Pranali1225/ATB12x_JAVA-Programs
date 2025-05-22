package interview_coding;

import java.util.HashMap;
import java.util.Map;

public class ArrayDuplication {
    public static void main(String[] args) {
        int[] num={12,34,12,45,55,56,45,2,4,4,67,7,8,8};
        Map<Integer,Integer> count=new HashMap<>();
        for(int numbers:num){
            if (count.containsKey(numbers)){
                count.put(numbers, count.get(numbers)+1);
            }else{
                count.put(numbers,1);
            }
            System.out.println("duplicate array element");
            for(Map.Entry<Integer,Integer> entry:count.entrySet()){
                if (entry.getValue()>1){
                    System.out.println(entry.getKey());
                }
            }

        }
    }
}
