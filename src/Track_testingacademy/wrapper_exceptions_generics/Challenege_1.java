package Track_testingacademy.wrapper_exceptions_generics;

import java.util.Scanner;

public class Challenege_1 {
    static class InvalidAgeException extends Exception {
        public InvalidAgeException(String message) {
            super(message);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        sc.close();

        try{
            if (age>=18){
                System.out.println("Valid age");
            }else{
                throw new InvalidAgeException("Age must be 18 or older");
            }
        } catch (InvalidAgeException e) {
            System.out.println("InvalidAgeException: " + e.getMessage());
        }

            }
        }


