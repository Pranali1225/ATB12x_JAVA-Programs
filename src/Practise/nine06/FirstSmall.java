package Practise.nine06;

public class FirstSmall {
    public static void main(String[] args) {
        String name="i love myself";
        String str[]=name.split(" ");
        StringBuilder result=new StringBuilder();
        for(String word:str){
            String first=word.substring(0,1).toLowerCase();
            String rest=word.substring(1).toUpperCase();
            result.append(first).append(rest).append(" ");
        }
        System.out.println(result);
    }
}
