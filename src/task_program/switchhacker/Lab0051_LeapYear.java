package task_program.switchhacker;

import java.util.Scanner;

public class Lab0051_LeapYear {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the year");
        int year= sc.nextInt();

                if(year %4==0){
                    System.out.println("This is a leap year");
                }else{
                    System.out.println("This is not a leap year");

        }
    }
}
