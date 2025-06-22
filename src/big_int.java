import java.math.BigInteger;

public class big_int {


    public static int findFibonacciIndexWithNDigits(int digits) {
        if (digits < 1) {
            throw new IllegalArgumentException("Number of digits must be ≥ 1");
        }

        BigInteger F1 = BigInteger.ONE;
        BigInteger F2 = BigInteger.ONE;
        BigInteger Ft;
        int index = 2;

        while (F2.toString().length() < digits) {
            Ft = F1.add(F2);
            F1 = F2;
            F2 = Ft;
            index++;
        }

        return index;
    }

    public static void main(String[] args) {
        long[][] tests = {
                {1, 1},      // F₁ = 1 (1 digit)
                {2, 7},      // F₇ = 13 (2 digits)
                {3, 12},     // F₁₂ = 144 (3 digits)
                {4, 17},     // F₁₇ = 1597 (4 digits)
                {5, 24},     // F₂₄ = 46368 (5 digits)
                {6, 27},     // F₂₇ = 196418 (6 digits)
                {10, 45},    // F₄₅ = 1134903170 (10 digits)
                {20, 93},    // F₉₃ = 12200160415121876738 (20 digits)
                {50, 237},   // F₂₃₇ ≈ 50 digits
                {100, 476},  // F₄₇₆ ≈ 100 digits
                {1000, 4782},// Project Euler #25
                {0, -1},     // invalid
                {-5, -1}     // invalid
        };

        for (long[] test : tests) {
            runTest((int) test[0], (int) test[1]);
        }
    }



    static void runTest(int digits, int expected) {
        try {
            int result = findFibonacciIndexWithNDigits(digits);
            boolean pass = (result == expected);
            System.out.println(
                    "digits=" + digits + " → " + (pass ? "PASS" : "FAIL") +
                            " (got=" + result + ", expected=" + expected + ")"
            );
        } catch (IllegalArgumentException e) {
            boolean pass = (expected == -1);
            System.out.println(
                    "digits=" + digits + " → " + (pass ? "PASS" : "FAIL") +
                            " (threw IllegalArgumentException)"
            );
        }
    }


}
