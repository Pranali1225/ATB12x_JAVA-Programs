package task_program.switchhacker;

import java.util.Scanner;

public class Lab0047_PrimeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        switch(num){
            case 1:
                if (num==1){
                    System.out.println("1 is not prime number");
                }
                break;
            case 2:
                if(num % num == 0){
                    System.out.println("number is prime number" +num);
                }else{
                    System.out.println("Not a prime number" + num);
                }
                break;
            default:
                System.out.println("Invalid input");
                break;

        }
    }
}
