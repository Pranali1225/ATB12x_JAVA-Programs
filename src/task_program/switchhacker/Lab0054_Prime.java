package task_program.switchhacker;

import java.util.Scanner;

public class Lab0054_Prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the number:");
        int num=sc.nextInt();

        boolean primecheck=true;
        if(num<=1){
            primecheck=false;
        } else {
            for(int i=2;i<num;i++){
                if(num%i==0){
                    primecheck=false;
                    break;
                }
            }
        }
        if(primecheck){
            System.out.println("number is prime: " + num);
        }else{
            System.out.println("number is not prime: " + num);
        }
    }
}
