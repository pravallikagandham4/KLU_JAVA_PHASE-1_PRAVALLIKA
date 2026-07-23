import java.util.*;
public class Harshad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int n = sc.nextInt();
        int temp = n,sum = 0;
        while(temp != 0){
            sum = sum + temp % 10;
            temp = temp / 10;
        }
        if(n%sum == 0){
            System.out.println(n+" "+sum+" is a Harshad");
        }
    }
}
