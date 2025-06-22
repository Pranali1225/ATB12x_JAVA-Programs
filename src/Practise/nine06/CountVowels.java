package Practise.nine06;

public class CountVowels {
    public static void main(String[] args) {
        int vowels=0;
        int constant=0;
        String name="yash";
        for(int i=0;i<name.length();i++){
            char ch=name.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                vowels++;
            }else{
                constant++;
            }
        }
        System.out.println("Total vowels= " + vowels + "and" + "Total constant= " + constant );
    }
}
