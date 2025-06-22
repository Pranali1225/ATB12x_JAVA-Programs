package Track_testingacademy.OOPS_test;

public class Challenge_11 {
    public static void main(String[] args) {
        Challenge_11 ob=new Challenge_11();
        ob.add(5, 3);
        ob.add(2.5, 3.7);
        ob.add(1, 2, 3);

    }
    public void add(int a, int b){
        int sum=a+b;
        System.out.println("Addition of two Numbers:- "+ sum);
    }
    void add(double a, double b) {
        double sum = a + b;
        System.out.println("Double addition: " + sum);
    }
    void add(int a, int b, int c) {
        int sum = a + b + c;
        System.out.println("Addition of three numbers: " + sum);
    }
}
