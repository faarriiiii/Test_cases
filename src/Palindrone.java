public class Palindrone {


    public static boolean isPalindrome(String s) {
        String clean = s.replaceAll("\\s+", "").toLowerCase();
        int n = clean.length();
        for (int i = 0; i < n / 2; i++) {
            if (clean.charAt(i) != clean.charAt(n - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    // Includes spaces, just checks mirrored characters
    public static boolean isPalindromeWithSpaces(String s) {
        s = s.toLowerCase();
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }


    public static void runTest(String s, boolean expected, boolean ignoreSpaces) {

        boolean result = ignoreSpaces ? isPalindrome(s) : isPalindromeWithSpaces(s);
        String mode = ignoreSpaces ? "Ignoring spaces" : "With spaces";

        if (result == expected) {
            System.out.println("PASS (" + mode + "): isPalindrome(\"" + s + "\") = " + result);
        } else {
            System.out.println("FAIL (" + mode + "): isPalindrome(\"" + s + "\") = " + result + " (expected " + expected + ")");
        }
    }

    public static void main(String[] args) {
        // Ignoring spaces
        runTest("Racecar", true, true);
        runTest("Hello", false, true);
        runTest("A man a plan a canal Panama", true, true);
        runTest("Was it a car or a cat I saw", true, true);
        runTest("No lemon no melon", true, true);
        runTest("not palindrome string", false, true);

        // With spaces included
        runTest("nurses run", false, false); // has space in the middle
        runTest("madam", true, false);
        runTest("step on no pets", false, false); // space-sensitive
        runTest(" ", true, false); // single space only
        runTest("racecar", true, false);
    }
}
