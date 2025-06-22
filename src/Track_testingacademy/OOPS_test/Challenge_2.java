package Track_testingacademy.OOPS_test;

public class Challenge_2 {
    String name;
    int roll;
    String section;
    Challenge_2(String name, int roll, String section){
        this.name=name;
        this.roll=roll;
        this.section=section;
    }
    void display(){
        System.out.println("Student: "+ name +" Roll No: "+ roll + "Section: "+ section);
    }
    public static void main(String[] args) {
        Challenge_2 student1=new Challenge_2("Pranali",321,"Computer Science");
        student1.display();

    }
}
