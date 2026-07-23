import java.util.*;
public class PerfectNumber {
    public static void main(Strong[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum =0;
        for(int i=1;i<=n/2;i++){
            if(n%i==0) {
                sum += i;
            }
        }
        if(sum==n){
            System.out.println(sum+" perfect number");
        }else{
            System.out.println(sum+" not perfect number");
        }
    }
}
