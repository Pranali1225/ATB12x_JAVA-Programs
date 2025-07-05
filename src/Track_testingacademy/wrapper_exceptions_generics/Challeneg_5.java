package Track_testingacademy.wrapper_exceptions_generics;

public class Challeneg_5 {
    public static void main(String[] args) {
        int value = 10;  // primitive int


        Integer boxedValue = value;
        System.out.println("Autoboxed: " + boxedValue);

        int unboxedValue = boxedValue;
        System.out.println("Unboxed: " + unboxedValue);
    }
}
