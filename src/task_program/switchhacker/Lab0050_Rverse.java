package task_program.switchhacker;

import java.util.Scanner;

public class Lab0050_Rverse {
    public static void main(String[] args) {
        String rev="";
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String str=sc.nextLine();
        for(int i=str.length()-1;i>=0;i--){
            char ch=str.charAt(i);
            rev=rev+ch;
        }
        System.out.println(rev);
    }
}
