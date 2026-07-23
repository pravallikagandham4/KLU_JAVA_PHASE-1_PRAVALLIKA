import java.util.*;
public class NestedRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = fun(n);
        System.out.println(ans);
    }
    static int fun(int n) {
        if(n >100){
            return n-10;
        }
        return fun(fun(n-1));
    }
}
