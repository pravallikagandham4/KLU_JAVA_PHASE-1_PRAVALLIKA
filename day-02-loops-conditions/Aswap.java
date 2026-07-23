import java.util.*;
public class Aswap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Indexes to be swapped: ");
        int k = sc.nextInt();
        int m = sc.nextInt();
        int temp = arr[k];
        arr[k] = arr[m];
        arr[m] = temp;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
