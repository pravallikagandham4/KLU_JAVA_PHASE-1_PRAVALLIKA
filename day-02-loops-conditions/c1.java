import java.util.*;
public class c1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int sum=0,count=0;
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if(arr[i]%6==0){
                sum+=arr[i];
                count++;
            }
        }
        float avg = (float)(sum/count);
        System.out.printf("The average of the array is: %.3f", avg);
    }
}
