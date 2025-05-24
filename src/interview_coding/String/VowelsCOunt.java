package interview_coding.String;

import java.util.Locale;

public class VowelsCOunt {
    public static void main(String[] args) {
        String input="pranali";
        int count=0;
        int constant=0;
        char ch;
        input=input.toLowerCase(Locale.ROOT);
        for(int i=0;i<input.length();i++) {
            ch = input.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                count++;
            }else{
                constant++;
            }
        }
        System.out.println("vowels= " + count);
        System.out.println("constant= " + constant);
    }
}
