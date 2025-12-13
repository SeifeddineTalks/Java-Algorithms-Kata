package kata.kyu8;

public class BooleanToString {

    public static String convert(boolean b) {
        return   (b)? "true" : "false";
    }

    static void main(String[] args) {

        System.out.println("Input abracadabra: " + convert(true));

    }

}
