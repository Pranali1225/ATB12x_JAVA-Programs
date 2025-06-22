package task_program.Task_24thMay;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the year");
        int year=sc.nextInt();
        System.out.println("ENter the month");
        int month=sc.nextInt();
        sc.close();
        int days;
        boolean isLeap=(year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        switch (month){
            case 1,3,5,7,8,10,12:
                 days=31;
                break;
            case 4,6,9,11:
                 days=30;
                 break;
            case 2:
                if (isLeap)
                    days=29;
                else
                    days=28;
                break;
            default:
                System.out.println("Invalid input");
                return;
        }
        System.out.println("Year " + year + " month " + month + " has " + days + " days.");
    }
}
