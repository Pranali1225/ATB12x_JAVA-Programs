package task_program.Stringsexample;

public class CapitalizeFirstLetter {
    public static void main(String[] args) {
        String str="my name is pranali";
        String words[]=str.split(" ");
        StringBuilder result=new StringBuilder();
        for(String test:words) {
            String first = test.substring(0, 1).toUpperCase();
            String rest = test.substring(1).toLowerCase();
            result.append(first).append(rest).append(" ");

        }
        System.out.println(result);
    }
}
