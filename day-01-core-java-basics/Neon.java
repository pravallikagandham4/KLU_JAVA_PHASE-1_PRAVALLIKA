import java.util.*;
public class Neon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0,s=n*n;
        while(s>0){
            sum = sum + (s % 10);
            s=s/10;
        }
        if(sum==n){
            System.out.println(n+"is a Neon Number");
        }else{
            System.out.println(n+"is not a Neon Number");
        }
    }
}
