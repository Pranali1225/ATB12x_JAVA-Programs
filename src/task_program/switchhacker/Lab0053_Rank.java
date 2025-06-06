package task_program.switchhacker;

import java.util.Scanner;

public class Lab0053_Rank {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the percentage");
        int grade=sc.nextInt();
        if(grade<=100 && grade>=90 ){
            System.out.println("A");
        } else if (grade<=89 && grade>=80)
        {
            System.out.println("B");
        }else if (grade<=79 && grade>=70)
        {
            System.out.println("C");
        }else if (grade<=69 && grade>=60)
        {
            System.out.println("D");
        }else if (grade<=59 && grade>=0)
        {
            System.out.println("F");
        }
        else{
            System.out.println("PLease enter correct value");
        }
    }
}
