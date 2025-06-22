package Practise.ten06.String;

import java.util.Locale;

public class StringPalindrome {
    public static void main(String[] args) {
        String input="level";
        input=input.toLowerCase();
        String rev="";
        for(int i=input.length()-1;i>=0;i--){
            char ch=input.charAt(i);
            rev=rev+ch;
        }
        System.out.println(rev);
        if(input.equals(rev)){
            System.out.println("string is palindrome");
        }else{
            System.out.println("String is not palindrome");
        }
    }
}
