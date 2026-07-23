import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Original Array:");
        printArray(arr);

        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            System.out.println("\nPass " + (i + 1) + ":");

            for (int j = i + 1; j < arr.length; j++) {
                System.out.print("Comparing " + arr[j] + " with " + arr[minIndex]);
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                    System.out.println(" -> New minimum found at index " + minIndex);
                } else {
                    System.out.println(" -> No change");
                }
            }

            if (minIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
                System.out.println("Swapping " + arr[minIndex] + " and " + arr[i]);
            } else {
                System.out.println("No swap needed");
            }

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
