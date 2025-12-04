package kata.kyu8;

public class OppositesAttract {

    public static boolean isLove(final int flower1, final int flower2) {

        return (flower1 % 2 + flower2 % 2) == 1;
    }

    static void main(String[] args) {

        System.out.println("Test 1 (1 , 4): " + isLove(1, 4));
    }
}
