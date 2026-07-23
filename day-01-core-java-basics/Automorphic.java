import java.util.*;
public class Automorphic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        automorphic(n);
    }
    static void automorphic(int n){
        int temp = n;
        int sum = n*n;
        int count = 0;
        while(temp!=0){
            temp/=10;
            count++;
        }
        int val = (int)Math.pow(10,count);
        temp = n;
        if(sum%val==temp){
            System.out.println("Automorphic Number");
        }
    }
}
