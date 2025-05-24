package ex_04_Switch;

import java.util.Scanner;

public class Lab0041_switchhasnext {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number between 1 to 7");
        int date=sc.nextInt();


        //we can use hasnext which helps to manage use case
        //hasnext have boolean value
        if(sc.hasNext()){
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
        } else{
            System.out.println("Wrong input");
        }

    }
}
