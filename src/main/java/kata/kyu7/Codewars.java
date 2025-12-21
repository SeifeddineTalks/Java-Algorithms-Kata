package kata.kyu7;

public class Codewars {
    public static String oddOrEven (int[] array) {
        int result = 0;

        for (int i=0; i<array.length; i++){
            result+=array[i];
        }

        return (result%2==0) ? "even" : "odd";

        }


    public static void main(String[] args) {
        System.out.println("Input {2, 5, 34, 6} result: " + oddOrEven ( new int[] {2, 5, 34, 6}));
    }
}

