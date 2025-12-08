package kata.kyu8;

public class SquareSum {

    public static int squareSum(int[] n)
    {
        int result=0;

        for (int i=0; i<n.length; i++) {
             result+=n[i]*n[i];
        }
        return result;
    }


    static void main(String[] args) {

        System.out.println("Test 1 {1,2,2}: " + squareSum(new int[] {1,2,2}));
    }
}
