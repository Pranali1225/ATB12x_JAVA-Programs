package ex_14_String;

public class Lab140_String_Interview02 {
    public static void main(String[] args) {
        String s1="Hello";
        String s4="Hello";
        //here in String constant pool have total 1 hello which have different identifers
        String s2=new String ("Hello");
        String s3=new String ("Hello");
        //here it will create 2 different pool objects
    }
}
