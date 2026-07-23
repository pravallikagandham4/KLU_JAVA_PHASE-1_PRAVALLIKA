public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6};

        System.out.println("Original Array:");
        printArray(arr);

        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            System.out.println("\nPass " + i + ":");
            System.out.println("Key = " + key);

            while (j >= 0 && arr[j] > key) {
                System.out.println("Comparing " + arr[j] + " > " + key + " -> shift");
                arr[j + 1] = arr[j];
                j--;
                printArray(arr);
            }

            arr[j + 1] = key;
            System.out.println("Insert key at position " + (j + 1));
            printArray(arr);
        }

        System.out.println("\nSorted Array:");
        printArray(arr);
    }

    static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
