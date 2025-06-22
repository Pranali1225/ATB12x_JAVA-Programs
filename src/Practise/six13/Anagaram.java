package Practise.six13;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Anagaram {
    public static void main(String[] args) {
        String s1="silent";
        String s2="listen";
        s1=s1.replaceAll("\\s","").toLowerCase();
        s2=s2.replaceAll("\\s","").toLowerCase();

        if(s1.length()!=s2.length()){
            System.out.println("String is not be a anagram");
        }
        char[] ch=s1.toCharArray();
        char [] ch2=s2.toCharArray();
        Arrays.sort(ch);
        Arrays.sort(ch2);
        if(Arrays.equals(ch,ch2)){
            System.out.println("String are anagram");
        }else{
            System.out.println("String is not anagram");
        }
    }
}
