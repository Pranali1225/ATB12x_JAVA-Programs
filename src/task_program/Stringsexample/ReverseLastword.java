package task_program.Stringsexample;

public class ReverseLastword {
    public static void main(String[] args) {
        String input="My name is pranali";
        String[] str=input.split(" ");
        String lastword=str[str.length-1];
        String reverse=new StringBuilder(lastword).reverse().toString();
        str[str.length-1]=reverse;
        System.out.println(String.join(" ",str));
    }
}
