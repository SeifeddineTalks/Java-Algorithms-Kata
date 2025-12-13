package kata.kyu7;

public class Sum {

    public static int GetSum(int a, int b) {
        int result = 0;

        if (a > b) {
            for (int i = b; i < a + 1; i++) {
                result += i;
            }
            return result;
        }
        else if (a < b) {
            for (int i = a; i < b + 1; i++) {
                result += i;
            }
            return result;
        }
        else {
            return a;
        }
    }

    public static void main(String[] args) {
        System.out.println("Input 5 and 1: " + GetSum(5, 1));
    }
}


