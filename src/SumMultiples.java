public class SumMultiples {

    public static int sumMultiples(int limit) {
        int sum = 0;
        for (int i = 1; i < limit; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum = sum + i;
            }
        }
        return sum; // main algorithm
    }

    public static void runTest(int limit, int expected) {
        int result = sumMultiples(limit);
        if (result == expected) {
            System.out.println("PASS: sumMultiples(" + limit + ") = " + result);
        } else {
            System.out.println("FAIL: sumMultiples(" + limit + ") = " + result + " (expected " + expected + ")");
        }
    }

    public static void main(String[] args) { // main test passing values
        runTest(10, 23);     // 3 + 5 + 6 + 9 = 23
        runTest(1, 0);       // no multiples
        runTest(16, 60);
        runTest(20, 119);

    }
}
