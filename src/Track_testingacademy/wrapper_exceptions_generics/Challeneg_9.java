package Track_testingacademy.wrapper_exceptions_generics;

public class Challeneg_9 {
    public static void main(String[] args) {
        try{
            m3();
        }catch(Exception e){
            System.out.println("Exception caught in main method");

        }
    }
    public static void m1(){
        int result=10/0;
    }
    public static void m2(){
        m1();
    }
    public static void m3(){
        m2();
    }


}
