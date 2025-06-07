package task_program.Stringsexample;

public class FirstLetterlower {
    public static void main(String[] args) {
        String str="YOU CAN EASILY LEARN JAVA";
        String s1[]=str.split(" ");
        StringBuilder sb=new StringBuilder();
        for(String input:s1){
            String first=input.substring(0,1).toLowerCase();
            String rest=input.substring(1).toUpperCase();
            sb.append(first).append(rest).append(" ");
        }
        System.out.println(sb);
    }
}
