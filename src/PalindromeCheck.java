public class PalindromeCheck {

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

    public static void runTest(String s, boolean expected) {
        boolean result = isPalindrome(s);

        if (result == expected) {
            System.out.println("PASS: isPalindrome(\"" + s + "\") = " + result);
        } else {
            System.out.println("FAIL: isPalindrome(\"" + s + "\") = " + result + " (expected " + expected + ")");
        }
    }

    public static void main(String[] args) {
        runTest("Racecar", true);
        runTest("Hello", false);
        runTest("A man a plan a canal Panama", true);
        runTest("", true);
        runTest("Was it a car or a cat I saw", true);
        runTest("No lemon no melon", true);
        runTest("not palindrome string", false);
    }
}
