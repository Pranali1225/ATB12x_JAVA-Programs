package ex_04_Switch;

import java.util.Scanner;

public class Lab0040_Switch {
    public static void main(String[] args) {
        //take input from user
        //if user enter 1 to 7
        //you will tell the which day it is

        //Step 1:using scanner class
        //Step 2:
        //Step 3 :- we will basically add step 3 as a rough logic
        //step 4:- you will write the fix the logic and optimize
        //step 5:-figure out edge case

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number between 1 to 7");
        int date= sc.nextInt();
        switch (date){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thrusday");
                break;
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Enter number from 1 to 7 only");
        }
        System.out.println("End of program");


    }
}
