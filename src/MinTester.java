import java.util.*;

public class MinTester {

    // Method to return the minimum of three integers
    public static int findMin(int a, int b, int c) {
        return Math.min(a, Math.min(b, c));
    }

    public static void main(String[] args) {
        int[][] tests = {
                {1, 5, 9, 1},     // min at first
                {7, 2, 9, 2},     // min at second
                {8, 9, 0, 0},     // min at third
                {-5, -10, -3, -10}, // all negative
                {4, 4, 4, 4},     // all equal
                {-2, 0, 3, -2},   // mix of negatives and positives
                {6, -3, 9, -3}    // your custom test
        };

        for (int i = 0; i < tests.length; i++) {
            int a = tests[i][0];
            int b = tests[i][1];
            int c = tests[i][2];
            int expected = tests[i][3];
            runTest(a, b, c, expected);
        }
    }


    static void runTest( int a, int b, int c, int expected) {
        int result = findMin(a, b, c);
        boolean pass = (result == expected); // true when result is same expected
        System.out.println(
                 "findMin(" + a + ", " + b + ", " + c + ") → " +
                        (pass ? "PASS" : "FAIL") +
                        " (got=" + result + ", expected=" + expected + ")"
        );
    }
}
