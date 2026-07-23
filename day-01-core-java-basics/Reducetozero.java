import java.util.*;
public class Reducetozero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int n = sc.nextInt();
        int ans = steps(n);
        System.out.println("No of steps to reduce into zero "+ans);
    }
    static int steps(int n){//14
        int c=0;
        while(n!=0){//1
            if(n%2==0){
                n=n/2;
            }else{
                n=n-1;
            }
            c++;
        }
        return c;
    }
}
