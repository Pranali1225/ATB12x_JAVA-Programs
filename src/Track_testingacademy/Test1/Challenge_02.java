package Track_testingacademy.Test1;

import java.util.Scanner;

public class Challenge_02 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        sc.close();
        int add= a+b;
        int sub=a-b;
        int mul=a*b;
        int div=a/b;
        int mod=a%b;
        System.out.println("Addition: "+ add);
        System.out.println("Subtraction: "+ sub);
        System.out.println("Multiplication: "+ mul);
        System.out.println("Division: "+ div);
        System.out.println("Modulus: "+ mod);
    }
}
