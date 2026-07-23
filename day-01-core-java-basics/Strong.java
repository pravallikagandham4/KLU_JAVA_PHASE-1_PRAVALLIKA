import java.util.*;
public class Strong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp=n,sum = 0;
        while(n>0){
            int d = n%10;
            sum += fact(d);
            n/=10;
        }
        if(sum==temp){
            System.out.println(temp+" is a strong number");
        }else{
            System.out.println(temp+" is not a strong number");
        }
    }
    static int fact(int n) {
        int fac = 1;
        for (int i = 2; i <= n; i++) {
            fac *= i;
        }
        return fac;
    }
}
