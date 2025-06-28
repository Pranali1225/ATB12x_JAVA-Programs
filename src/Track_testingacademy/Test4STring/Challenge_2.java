package Track_testingacademy.Test4STring;

public class Challenge_2 {
    public static void main(String[] args) {
        String s1="Hello";
        String s2="hello";
        String s3="Hello";

        boolean first=s1.equals(s2);
        boolean second=s1.equalsIgnoreCase(s2);


        System.out.println("equals(): "+ first+ ","+"equalsIgnoreCase():"+ second+ ","+ "compareTo():"+s1.compareTo(s2) );
    }
}
