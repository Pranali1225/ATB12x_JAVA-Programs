package task_program.Task_19June;

import java.util.Scanner;

public class Positive_Negative {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num= sc.nextInt();
        sc.close();
        if(num<0){
            System.out.println("Entered number is negative");
        } else if (num>0) {
            System.out.println("Entered number is positive");
        }else if(num==0){
            System.out.println("Entered number is Zero");
        }else{
            System.out.println("");
        }
    }
}
