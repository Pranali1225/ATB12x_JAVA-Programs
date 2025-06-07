package task_program.Stringsexample;

public class VowelCount {
    public static void main(String[] args) {
        int vowel=0;
        int constant=0;
        String s1="neha";
        for(int i=0;i<=s1.length();i++){
            char ch=s1.charAt(i);
            if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                vowel++;
            }else{
                constant++;
            }
        }
        System.out.println("vowels= " + vowel);
        System.out.println("constant= " + constant);
    }
}
