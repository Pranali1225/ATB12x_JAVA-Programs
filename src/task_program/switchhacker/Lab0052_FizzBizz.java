package task_program.switchhacker;

public class Lab0052_FizzBizz {
    public static void main(String[] args) {
        int num=100;
        for(int i=1;i<=num;i++){
            if(i %3==0){
                System.out.println("Fizz");
            }
            else if (i%5==0){
                System.out.println("bizz");
            }

        }
    }
}
//take number from one to 100
//output- if multiple of 3 then print fizz else if multiple of 5 print bizz