package task_program.switchhacker;

import java.util.Scanner;

public class Lab0048_Factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int num = sc.nextInt();
        int number=1;
        for(int i=1;i<=num;i++){
            number=number*i;
        }
        System.out.println(number);
    }
}
