package task_program.Stringsexample;

public class StringPalindrome {
    public static void main(String[] args) {
        String s1="level";
        String rev="";
        char ch;
        for(int i=s1.length()-1;i>=0;i--)
        {
             ch=s1.charAt(i);
             rev=rev+ch;
        }
        System.out.println(rev);
        if(rev.equals(s1)){
            System.out.println("String is palindrome");
        }else{
            System.out.println("String is not palindrome");
        }
    }
}
