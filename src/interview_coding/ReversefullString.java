package interview_coding;

public class ReversefullString {
    public static void main(String[] args) {
        String str="I love you";
        String[] rev=str.split(" ");
        StringBuilder Output=new StringBuilder();
        for(String reverse:rev){
            StringBuilder reverseword=new StringBuilder(reverse);
            reverseword.reverse();
            Output.append(reverseword).append(" ");
        }
        System.out.println(Output);

    }
}
