package task_program.switchhacker;

import java.util.Scanner;

public class Lab0045_Vowels {
    public static void main(String[] args) {
        int count=0;
        int constant =0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String str=sc.nextLine();
        for(int i=0;i<str.length();i++){
char ch=str.charAt(i);if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
count++;
}else{
constant++;
}}
        System.out.println("number of vowels present in the string"+ count);
        System.out.println("number of constant present in the string" +constant);
}
}
