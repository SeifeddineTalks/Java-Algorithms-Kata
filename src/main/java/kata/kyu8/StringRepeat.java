package kata.kyu8;

public class StringRepeat {

    public static String repeatStr(final int repeat, final String string) {


        StringBuilder repeatedString  = new StringBuilder();

        for (int i=0; i< repeat; i++){
            repeatedString.append(string);
        }

        return repeatedString.toString();
    }


    public static void main(String[] args) {
        System.out.println("Input 3 and Hello result: " + repeatStr (3, "Hello"));
    }
}
