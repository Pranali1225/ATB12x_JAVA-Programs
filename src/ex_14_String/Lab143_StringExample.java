package ex_14_String;

public class Lab143_StringExample {
    public static void main(String[] args) {
        String s="java";
        char c=s.charAt(2);
        System.out.println(c);//v
        System.out.println(s.codePointAt(0));//74

        //compare toignore string
        int result="abc".compareToIgnoreCase("ABC");
        System.out.println(result); //here it will return zero

        int result2="abc".compareTo("ABC");
        System.out.println(result2);
        //it will check the both string are matched with each other


        //index of
        int idx="java".indexOf("a");
        System.out.println(idx);//output will give the integer from 0 to last

        //lastindex of
        int idx1="java".lastIndexOf("a");
        System.out.println(idx1);
        //give index id from last


        //isEmpty()
        boolean b= "".isEmpty();
        System.out.println(b);// will give true

        //join
        String s1=String.join("pranali", "Sheth","pradip");
        System.out.println(s1);
        //sheth pranali pradip (it will join element delimiter and string)


        //replace
        String s2= "Pranali".replace('n', 'j');
        System.out.println(s2);
        //it will replace n with j

        boolean b1="java".startsWith("ja");
        System.out.println(b1); //checks string is starting from ja







    }
}
