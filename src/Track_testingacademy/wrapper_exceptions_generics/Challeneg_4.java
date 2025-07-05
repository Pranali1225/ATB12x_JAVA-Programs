package Track_testingacademy.wrapper_exceptions_generics;

import java.util.Scanner;

public class Challeneg_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = {10, 20, 30};

        try {
            System.out.print("Enter array index (0-2): ");
            int index = sc.nextInt();

            System.out.print("Enter a number to divide by: ");
            int divisor = sc.nextInt();

            int result = numbers[index] / divisor;
            System.out.println("Result: " + result);

        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught: ArithmeticException or ArrayIndexOutOfBoundsException");
        }

        sc.close();
    }
}
