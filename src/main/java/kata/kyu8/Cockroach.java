package kata.kyu8;

public class Cockroach {
    public static int cockroachSpeed(double x) {
        int result;
        result = (int) Math.floor(x*1000/36);
        return result;
    }

    static void main(String[] args) {

        System.out.println("Input 1.08: " + cockroachSpeed(1.08));

    }


}
