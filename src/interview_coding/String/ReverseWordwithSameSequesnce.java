package interview_coding.String;

public class ReverseWordwithSameSequesnce {
    public static void main(String[] args) {
        String str="my name is pranali";
        String[] st=str.split(" ");
        StringBuilder result=new StringBuilder();
        for(String output:st){
            StringBuilder sti=new StringBuilder(output);
            sti.reverse();
            result.append(sti).append(" ");
        }
        System.out.println(result);
    }
}
