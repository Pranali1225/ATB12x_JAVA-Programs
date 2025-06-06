package ex_14_String;

public class Lab141_String_InterviewEQUALS {
    public static void main(String[] args) {
        String s1="Hello";
        String s3="Hello";

        String s2=new String("Hello");
        String s4=new String("Hello");
        String s5=new String("hello");

        //lets see ==
        System.out.println(s1=s2); //ans will false
        System.out.println(s1=s3); //ans will true
        System.out.println(s2==s4);//ans will false
        System.out.println(s2==s4);//ans will false

        //String constant pool dont have the same string


        //equals method in string
        //equals will check the conetent
        System.out.println(s1.equals(s2)); //ans will true
        System.out.println(s1.equals(s3)); //ans will true
        System.out.println(s1.equals(s5));//ans will false

        //ignore case fnction
        System.out.println(s1.equalsIgnoreCase(s5)); //ans will true it will convert all letter small & checks the value
    }
}
