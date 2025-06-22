package task_program.task17th_may;

import java.util.Scanner;

public class Odd_And_even_Ternory {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        sc.close();
        String result=(a%2==0)?"Number is even":"Number is odd";
        System.out.println(result);
    }
}
