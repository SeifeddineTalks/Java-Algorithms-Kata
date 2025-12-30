package kata.kyu7;

public class SumCubes {

    public static long sumCubes (long n) {
        long result = 0;

        for (int i=1; i<=n; i++){
            result+= (long) Math.pow(i,3);
        }

        return result;
    }


    public static void main(String[] args) {
        System.out.println("Input {2, 5, 34, 6} result: " + sumCubes (3));
    }
}

