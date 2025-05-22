package interview_coding;

import java.util.Locale;

public class PlaindromeCheck {
    public static void main(String[] args) {
        String input="level";
        input=input.toLowerCase(Locale.ROOT);
        if(input==null||input.isEmpty()){
            System.out.println("Blank string");
        }
        String rev="";
        for (int i=input.length()-1;i>=0;i--){
            char ch=input.charAt(i);
            rev+=ch;

        }
        System.out.println(rev);
        if(input.equals(rev)){
            System.out.println("plaindrome");
        }else{
            System.out.println("not Plaindrome");
        }

    }
}
