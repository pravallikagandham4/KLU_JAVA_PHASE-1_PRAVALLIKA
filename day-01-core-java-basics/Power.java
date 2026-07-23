import java.util.*;
public class Power {
    public static void main(String[] args) {
        power();
    }
    static void power(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Base number");
        int n = sc.nextInt();
        System.out.println("Enter the Power");
        int power = sc.nextInt();
        int ans=1;
        while(power!=0){
            ans*=n;
            power--;
        }
        System.out.println(ans);
    }
}
