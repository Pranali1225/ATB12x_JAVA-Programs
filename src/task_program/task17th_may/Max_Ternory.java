package task_program.task17th_may;

import java.util.Scanner;

public class Max_Ternory {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        int result=(a>b)?a:(b>c)?b:c;
        System.out.println(result);
    }
}
