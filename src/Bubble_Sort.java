import java.util.ArrayList;

public class Bubble_Sort {


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

    public static void main(String[] args) {
        ArrayList<Integer> Data = new ArrayList<>();
        Data.add(3);
        Data.add(4);
        Data.add(2);
        Data.add(8);
        Data.add(1);
        Data.add(0);

        Data = bubbleSort(Data);

        int x = 2;
        int y = 1;

        if (!compare(x, y)) {
            System.out.println("Failed Comparison");
        }

        ArrayList<Integer> sortedData = new ArrayList<>();
        sortedData.add(0);
        sortedData.add(1);
        sortedData.add(2);
        sortedData.add(3);
        sortedData.add(4);
        sortedData.add(8);

        if (sortedData.size() == Data.size()) {
            System.out.println();
        }

        for (int i = 0; i < Data.size(); i++) {
            if (!sortedData.get(i).equals(Data.get(i))) {
                System.out.println("Error at index " + i + ": " + Data.get(i) + " != " + sortedData.get(i));
            }
        }
    }
}
