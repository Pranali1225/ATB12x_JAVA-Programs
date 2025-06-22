package task_program.task17th_may;

import java.util.Scanner;

public class AgeCriteria_ternory {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        String result=(age<18)?"User is minor":(age>65)?"User is Senior":"User is adult";
        System.out.println(result);
    }
}
