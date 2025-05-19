package ex_03_Operators;

public class LAB008_Interview {
    public static void main(String[] args) {
        //concatination
        String s1="pranali";
        String s2="sheth";
        System.out.println(s1+s2);//pranalisheth

        int a=10;
        int b=20;
        System.out.println(a+b);//30
        System.out.println(s1+s2+a+b);//pranalisheth1020
        System.out.println(a+b+s1+s2);//30pranalisheth
        System.out.println(s1+s2+(a+b));

    }
}
