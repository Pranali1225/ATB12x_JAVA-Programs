package task_program.Stringsexample;

public class ReverseAlternate {
    public static void main(String[] args) {

        String s1="My name is pranali";
        String[] str=s1.split(" ");
        for(int i=1;i< str.length;i+=2){
            str[i]=new StringBuilder(str[i]).reverse().toString();
        }
        System.out.println(String.join(" ", str));
    }
}
