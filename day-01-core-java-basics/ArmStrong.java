import java.util.*;
public class ArmStrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int temp =n,sum=0;
        while(temp!=0){
            temp/=10;
            count++;
        }
        temp =n;
        while(temp!=0){
            int d=temp%10;
            sum+=Math.pow(d,count);
            temp /= 10;
        }
        if(sum==n){
            System.out.println(n+" is a ArmStrong number");
        }else{
            System.out.println(n+" is not a ArmStrong number");
        }
    }
}
