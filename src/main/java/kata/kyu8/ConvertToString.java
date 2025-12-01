package kata.kyu8;

public class ConvertToString {

    public static String numberToString(int num) {

        String result = String.valueOf(num);
        return result;
}

    static void main(String[] args) {
        System.out.println("Test 1 (67): " + numberToString(67));
        System.out.println("Test 1 (123): " + numberToString(123));

    }
}



