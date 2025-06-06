package ex_14_String;

public class Lab145_StringSubsStringExample {
    public static void main(String[] args) {
        String s="Java".substring(2);
        System.out.println(s);
        //subsstring can be done using index
        //substring will always remove the characheter

        String s1="Pranali".substring(1,3);
        System.out.println(s1);

        char[] ch=s1.toCharArray();
        System.out.println(ch);

        String s2="Java    ".trim();
        System.out.println(s2);

        boolean b1=" ".isBlank();
        System.out.println(b1);


        String s3="me".repeat(2);
        System.out.println(s3);

        String s4=String.format("%s = %d","age", 25);
        System.out.println(s4);

        long count="a\nb\nc".lines().count();
        System.out.println(count);

    }
}
