import java.util.*;
public class TailRecursion {
    static void fun(int n){
        if(n>0){
            System.out.print(n+" ");
            fun(n-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fun(n);
    }
}
