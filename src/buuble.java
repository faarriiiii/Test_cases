import java.util.ArrayList;
import java.util.List;

public class buuble {

    public static ArrayList<Integer> bubbleSort(ArrayList<Integer> input) {

        ArrayList<Integer> bubbleSort = new ArrayList<>(input);
        int n = bubbleSort.size();

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (bubbleSort.get(j) > bubbleSort.get(j + 1)) {
                    int temp = bubbleSort.get(j);
                    bubbleSort.set(j, bubbleSort.get(j + 1));
                    bubbleSort.set(j + 1, temp);
                }
            }
        }
        return bubbleSort;
    }

    public static boolean compare(int a, int b) {
        return a < b;
    }

    public static void runSortTest(ArrayList<Integer> input, ArrayList<Integer> expected) {
        ArrayList<Integer> result = bubbleSort(input);

        boolean pass = result.equals(expected);

        System.out.println(
                "Input: " + input +
                        " → " + (pass ? "PASS" : "FAIL") +
                        "\nGot:      " + result +
                        "\nExpected: " + expected + "\n"
        );
    }


    public static void main(String[] args) {
        // Comparison check
        int x = 1;
        int y = 2;
        if (!compare(x, y)) {
            System.out.println("Failed Comparison");

        }
        else {
            System.out.println("Successful Comparison");
        }

        // Run tests
        runSortTest(
                new ArrayList<>(List.of(3, 4, 2, 8, 1, 0)),
                new ArrayList<>(List.of(0, 1, 2, 3, 4, 8))
        );

        runSortTest(
                new ArrayList<>(List.of(5, 3, 1)),
                new ArrayList<>(List.of(1, 3, 5))
        );

        runSortTest(
                new ArrayList<>(List.of(1, 2, 3)),
                new ArrayList<>(List.of(1, 2, 3))
        );

        runSortTest(
                new ArrayList<>(List.of(2, 2, 2)),
                new ArrayList<>(List.of(2, 2, 2))
        );

        runSortTest(
                new ArrayList<>(List.of()),
                new ArrayList<>(List.of())
        );
    }
}
