import java.util.*;
public class PSquare {
    public static void main(String[] args) {
        PerfectSquare();
    }
    static void PerfectSquare() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int flag=0;
        for(int i=1;i<=n/2;i++){
            if(i*i==n){
                System.out.println("Perfect Square");
                flag=1;
                break;
            }
        }
        if(flag==0){
            System.out.println("Not an Perfect Square");
        }
    }
}
