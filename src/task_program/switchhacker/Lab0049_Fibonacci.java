package task_program.switchhacker;

import java.util.Scanner;

public class Lab0049_Fibonacci {
    public static void main(String[] args) {
        int num1=0, num2=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number to find fibonacci series");
        int num3=sc.nextInt();
        for(int i=0;i<num3;i++){
            System.out.println(num1);
            int num4=num1+num2;
            num1=num2;
            num2=num4;
        }
    }
}
