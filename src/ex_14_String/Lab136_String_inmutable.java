package ex_14_String;

public class Lab136_String_inmutable {
    public static void main(String[] args) {
        String name="Pranali";
        name.toUpperCase(); // it will convert Upper case
        System.out.println(name); //output=Pranali
        //here op will come as Pranali cuz name.toUppercase will create new PRANALI in JVM pool
        //as name.toUppercase is not have any variable
    }
}
