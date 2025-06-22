package Practise.six13;

public class FrequencyOfStringWIthFor {
    public static void main(String[] args) {
        String str="pranali";
        while(str.length()>0){
            char ch=str.charAt(0);
            int freq=0;
            for(int i=0;i<str.length();i++){
                if(str.charAt(i)==ch) freq++;}
                System.out.println(ch+ " = "+ freq);

            str=str.replaceAll(String.valueOf(ch),"");

        }

    }
}
