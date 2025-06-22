package Track_testingacademy.OOPS_test;

import java.util.Scanner;

public class Challenge_12 {
    public static void main(String[] args) {
        Parent parent = new Parent();
        parent.display();
        Child child = new Child();
        child.display();

    }
}

     class Parent{
        void display(){
            System.out.println("this is parent class method");
        }
    }
     class Child{
        void display(){
            System.out.println("This is child class method");
        }

}
