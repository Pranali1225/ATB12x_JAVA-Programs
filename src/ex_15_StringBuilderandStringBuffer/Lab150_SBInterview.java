package ex_15_StringBuilderandStringBuffer;

public class Lab150_SBInterview {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Java");
        sb.append(" Programming");
        System.out.println(sb);
        sb.delete(5,16);
        System.out.println(sb);

        sb.replace(0,4,"python");
        System.out.println(sb);
    }
}
