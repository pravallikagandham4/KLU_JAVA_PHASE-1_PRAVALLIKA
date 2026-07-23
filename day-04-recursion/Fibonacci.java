import java.util.*;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = fun(n);
        System.out.println(ans);
    }
    static int fun(int n) {
        if(n == 1||n==0) return n;
        return fun(n-1) + fun(n-2);
    }
}
