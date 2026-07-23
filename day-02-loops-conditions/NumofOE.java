import java.util.*;
public class NumofOE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int oc=0,ec=0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] % 2 == 0) {
                ec++;
            }else{
                oc++;
            }
        }
        System.out.println("No of Odd Elements: "+oc);
        System.out.println("No of Even Elements: "+ec);
    }
}
