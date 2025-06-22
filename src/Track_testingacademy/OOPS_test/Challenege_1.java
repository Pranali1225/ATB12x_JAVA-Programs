package Track_testingacademy.OOPS_test;

public class Challenege_1 {
    String name;
    int age;
    Challenege_1(String name,int age){
        this.name=name;
        this.age=age;
    }
    void display(){
        System.out.println("Name:- "+ name+ " ,age:- "+ age);
    }
    public static void main(String[] args) {
        Challenege_1 person1=new Challenege_1("Pranali",24);
        Challenege_1 person2=new Challenege_1("Neha", 34);


    }



}
