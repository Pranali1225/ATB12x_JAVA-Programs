package Track_testingacademy.OOPS_test;

public class Challenge_13 {
        int x = 10;
        class Inner{
            void display(){
                System.out.println("Outer class variable x: "+ x);
                System.out.println("Inner class accessing outer class variale: " + x);
            }
        }

    public static void main(String[] args) {
        Challenge_13 outer = new Challenge_13();
        Challenge_13.Inner inner = outer.new Inner();
        inner.display();
    }
}
