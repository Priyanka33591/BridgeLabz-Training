public class InsertionSortEmployeeID {

    public static void insertionSort(int[] ids) {
        int n = ids.length;

        for (int i = 1; i < n; i++) {
            int key = ids[i];
            int j = i - 1;

            // Shift elements
            while (j >= 0 && ids[j] > key) {
                ids[j + 1] = ids[j];
                j--;
            }

            // Insert element
            ids[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] empIds = {104, 101, 109, 102, 105};

        insertionSort(empIds);

        System.out.println("Sorted Employee IDs:");
        for (int id : empIds) {
            System.out.print(id + " ");
        }
    }
}
