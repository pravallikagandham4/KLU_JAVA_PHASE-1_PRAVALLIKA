public class MultipleMainMethod {

    // Method 1: Bubble Sort
    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Method 2: Selection Sort
    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    // Method 3: Insertion Sort
    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    // Utility Method: Print Array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Main Method
    public static void main(String[] args) {
        int[] arr1 = {5, 3, 8, 4, 2};
        int[] arr2 = {64, 25, 12, 22, 11};
        int[] arr3 = {12, 11, 13, 5, 6};

        System.out.println("Bubble Sort:");
        bubbleSort(arr1);
        printArray(arr1);

        System.out.println("Selection Sort:");
        selectionSort(arr2);
        printArray(arr2);

        System.out.println("Insertion Sort:");
        insertionSort(arr3);
        printArray(arr3);
    }
}
