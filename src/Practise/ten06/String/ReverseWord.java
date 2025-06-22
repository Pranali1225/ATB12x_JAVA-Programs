package Practise.ten06.String;

import java.util.Scanner;

public class ReverseWord {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String str=sc.next();

        for(int i=str.length()-1;i>=0;i--) {
            char ch = str.charAt(i);
            System.out.print(ch);
        }
    }
}
