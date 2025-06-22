package Practise.nine06;

public class Palindrome {
    public static void main(String[] args) {
        String input="level";
        String  rev="";
        for(int i=input.length()-1;i>=0;i--){
            char ch=input.charAt(i);
            rev=rev+ch;
        }
        if(rev.equals(input)){
            System.out.println("String is palindrome");
        }else{
            System.out.println("String is not palindrome");
        }
    }
}
