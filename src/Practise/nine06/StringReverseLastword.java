package Practise.nine06;

public class StringReverseLastword {
    public static void main(String[] args) {
        String str="I am working with dreamjob";
        String input[]=str.split(" ");
        String lastword=input[input.length-1];
        String rev=new StringBuilder(lastword).reverse().toString();
        input[input.length-1]=rev;
        System.out.println(String.join(" ",input));
    }
}
