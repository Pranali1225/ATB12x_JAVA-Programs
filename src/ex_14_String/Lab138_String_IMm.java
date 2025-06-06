package ex_14_String;

public class Lab138_String_IMm {
    public static void main(String[] args) {
        String s1="hello";
        s1=s1.concat("World");
        System.out.println(s1);
        //here hello is already created in string constant pool
        // And we are conacatinating string world for s1

    }
}
