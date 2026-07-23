import java.util.*;
public class AdamNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int squared = n*n;
        int reverse = reverse(n);
        int squared_reverse = reverse * reverse;
        int reverse_reverse = reverse(squared_reverse);
        if(reverse_reverse == squared){
            System.out.println(n+" is a Adam Number");
        }else{
            System.out.println(n+" is not a Adam Number");
        }
    }
    static int reverse(int n){
        int sum=0;
        while(n!=0){
            int rem = n%10;
            sum = (sum*10)+rem;
            n = n/10;
        }
        return sum;
    }
}
