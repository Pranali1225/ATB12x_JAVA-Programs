package Track_testingacademy.OOPS_test;

public class Challege_6 {
    public static void main(String[] args) {
        Vehical vehical=new Car();
        Vehical vehical1=new Bike();
        vehical.start();
        vehical1.start();

    }
    static class  Vehical{
        void start(){
            System.out.println("Vehical is starting");
        }
    }
    static class Car extends Vehical{
        void Start(){
            System.out.println("Car engine start with roar");
        }
    }

    static class Bike extends Vehical{
        void start(){
            System.out.println("Bike engine start with a purrr");
        }
    }

}
