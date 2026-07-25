import java.util.*;
class Main{
    static int fact(int n){
        if (n==0||n==1)
        return 1;
        return n*fact(n-1);
    }
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int ans = fact(n);
        System.out.println(ans);
    }
}