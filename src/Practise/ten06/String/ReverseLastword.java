package Practise.ten06.String;

public class ReverseLastword {
    public static void main(String[] args) {
        String are="My name is durga";
        String[] input=are.split(" ");
        String lastword=input[input.length-1];
        String result=new StringBuilder(lastword).reverse().toString();
        input[input.length-1]=result;
        //String final=String.join(" ",input);
        System.out.println(String.join(" ",input));

    }
}
