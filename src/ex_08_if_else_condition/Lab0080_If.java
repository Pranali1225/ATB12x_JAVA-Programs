package ex_08_if_else_condition;

public class Lab0080_If {
    public static void main(String[] args) {
        int age=Integer.parseInt(args[0]);
        if (age > 18) {

            System.out.println("You can vote");
        }else{
            System.out.println("You can not vote");
        }
    }
}
