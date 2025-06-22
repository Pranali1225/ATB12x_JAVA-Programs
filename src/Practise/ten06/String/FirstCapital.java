package Practise.ten06.String;

public class FirstCapital {
    public static void main(String[] args) {
        String str="my name is neha";
        String[] input=str.split(" ");
        StringBuilder result=new StringBuilder();
        for(String word:input){
            String first=word.substring(0,1).toUpperCase();
            String rest=word.substring(1).toLowerCase();
            result.append(first).append(rest).append(" ");
        }
        System.out.println(result);
    }
}
