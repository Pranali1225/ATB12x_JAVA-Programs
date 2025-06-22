package Practise.ten06.String;

public class ReverseALternate {
    public static void main(String[] args) {
        String str="My name is isha";
        String[] input=str.split(" ");
        for(int i=1;i< input.length;i+=2){
            input[i] =new StringBuilder(input[i]).reverse().toString();
        }
        String result=String.join(" ",input);
        System.out.println(result);
    }
}
