import java.util.*;

public class Main {

    // min method to return the minimal number among three
    public static int findMin(int a, int b, int c) {
        return Math.min(a, Math.min(b, c));
    }

    public static void main(String[] args) {
        // Test Case 1: Minimal at first position
        int min1 = findMin(1, 5, 9);
        if (min1 != 1) {
            System.out.println("Test 1 Failed: Expected 1, got " + min1);
        }

        // Test Case 2: Minimal at second position
        int min2 = findMin(7, 2, 9);
        if (min2 != 2) {
            System.out.println("Test 2 Failed: Expected 2, got " + min2);
        }

        // Test Case 3: Minimal at third position
        int min3 = findMin(8, 9, 0);
        if (min3 != 0) {
            System.out.println("Test 3 Failed: Expected 0, got " + min3);
        }

        // Test Case 4: Negative numbers
        int min4 = findMin(-5, -10, -3);
        if (min4 != -10) {
            System.out.println("Test 4 Failed: Expected -10, got " + min4);
        }

        // Test Case 5: All  equal numbers
        int min5 = findMin(4, 4, 4);
        if (min5 != 4) {
            System.out.println("Test 5 Failed: Expected 4, got " + min5);
        }

        // Test Case 6: Mix of negatives and positives
        int min6 = findMin(-2, 0, 3);
        if (min6 != -2) {
            System.out.println("Test 6 Failed: Expected -2, got " + min6);
        }

        int myTest = findMin(6, -3, 9);
        System.out.println("My Test: The minimum is: " + myTest);

        // If no error messages printed
        System.out.println("All test cases passed!");
    }
}
