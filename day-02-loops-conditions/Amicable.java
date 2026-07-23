import java.util.*;
public class Amicable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        System.out.println("Enter the number : ");
        int squared = sc.nextInt();
        int s1=0,s2=0;
        for(int i=1;i<=n/2;i++){
            if(n%i==0){
                s1+=i;
            }
        }
        for(int i=1;i<=squared/2;i++){
            if(squared%i==0){
                s2+=i;
            }
        }
        if(s1==squared&&s2==n){
            System.out.println(n+" "+squared+" is a Amicable pair");
        }else{
            System.out.println(n+" "+squared+" is not a Amicable pair");
        }
    }
}
