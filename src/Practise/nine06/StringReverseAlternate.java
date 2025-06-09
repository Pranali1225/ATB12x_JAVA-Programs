package Practise.nine06;

public class StringReverseAlternate {
    public static void main(String[] args) {
        String input="I got the good oppertunity";
        String[] str=input.split(" ");
        for(int i=1;i<str.length;i+=2){
            str[i]=new StringBuilder(str[i]).reverse().toString();

        }
        System.out.println(String.join(" ",str));

    }
}
