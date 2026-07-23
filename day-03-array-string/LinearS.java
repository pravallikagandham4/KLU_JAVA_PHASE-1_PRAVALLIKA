import java.util.*;
public class LinearS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int flag=0;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int a = sc.nextInt();
        for(int i = 0; i < n; i++){
            if(arr[i] == a){
                System.out.println(arr[i]+" Is Present");
                flag=1;
                break;
            }
        }
        if(flag==0){
            System.out.println(a+" Is not Present");
        }
    }
}
