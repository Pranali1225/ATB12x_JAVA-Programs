package interview_coding;

public class ReverseString {
    public static void main(String[] args) {
        String str="pranali";
        String rev="";
        char ch;
        for(int i=str.length()-1;i>=0;i--){
            ch=str.charAt(i);
            rev=rev+ch;
        }
        System.out.println(rev);
    }
}
