import java.util.*;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = fun(n);
        System.out.println(ans);
    }
    static int fun(int n) {
        if(n == 1||n==0) return 1;
        return n * fun(n-1);
    }
}
