package ex_02_variable_and_keywords_Declaration;

public class Lab0021_finalVariable {
    public static void main(String[] args) {
        int local;
        local = 10;
        System.out.println(local);

        final float PI = 3.14f;
        // PI = 3.13f; This is final in nature.
        System.out.println(PI);
    }
}
