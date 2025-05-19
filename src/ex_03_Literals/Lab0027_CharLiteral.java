package ex_03_Literals;

public class Lab0027_CharLiteral {
    public static void main(String[] args) {
        //whenever you want to declare char always use single quote
        char ch='A';
        //if we use " " means java will consider this as string
       // char ch1="ch";
        System.out.println(ch);
        //in java we have ascii value
        //0-31 are control charcater(like newline, backspace)
        char my_laugh_smily = '\u1f60'; // :)
        System.out.println(my_laugh_smily);

        char c11  = '\u1F60';
        //32-126 printable character like letters digit symbols
        int as=(int)ch;
        System.out.println(as);


    }
}
