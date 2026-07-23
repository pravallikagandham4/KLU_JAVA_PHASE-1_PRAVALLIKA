import java.util.*;
public class PerfectSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        boolean isPerfectSquare = false;
        for(int i=1;i<=n/2;i++){
            int sum = i*i;
            if(sum==n){
                isPerfectSquare = true;
            }
        }
        if(isPerfectSquare){
            System.out.println("Perfect Square");
        }else{
            System.out.println("Not Perfect Square");
        }
    }
}

