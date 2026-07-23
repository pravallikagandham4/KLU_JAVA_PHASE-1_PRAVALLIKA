import java.util.*;
public class c2 {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the size of the array: ");
            int n = sc.nextInt();
            int[] arr = new int[n];
            System.out.println("Enter the elements of the array: ");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println("Enter the index of the element to be replaced: ");
            int x = sc.nextInt();
            System.out.println("Enter the Value of the element to be replaced: ");
            int y = sc.nextInt();
            arr[x] = y;
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
    }
}