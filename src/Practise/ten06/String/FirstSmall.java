package Practise.ten06.String;

public class FirstSmall {
    public static void main(String[] args) {
        String str="my name is issue";
        String input[] =str.split(" ");
        StringBuilder result=new StringBuilder();
        for(String word:input){
            String first=word.substring(0,1).toLowerCase();
            String rest=word.substring(1).toUpperCase();
            result.append(first).append(rest).append(" ");
        }
        System.out.println(result);
    }
}
