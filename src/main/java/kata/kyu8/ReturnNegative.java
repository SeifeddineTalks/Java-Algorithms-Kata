package kata.kyu8;

public class ReturnNegative {

    // --- 1. The Kata Submission Method ---
    public static int makeNegative(final int x) {
        // We use Math.abs(x) to get the positive value of x,
        // and then multiply by -1 to ensure it's negative.
        return -Math.abs(x);
    }

    // --- 2. Local Test Runner ---
    public static void main(String[] args) {
        // Test 1: Should return -5 (was positive)
        System.out.println("Test 1 (5): " + makeNegative(5));

        // Test 2: Should return -5 (was already negative)
        System.out.println("Test 2 (-5): " + makeNegative(-5));

        // Test 3: Should return 0 (0 is never negative)
        System.out.println("Test 3 (0): " + makeNegative(0));
    }
}