import java.util.*;
public class RangePrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Firt Number : ");
        int first = sc.nextInt();
        System.out.println("Enter the Last Number : ");
        int last = sc.nextInt();
        int count=0;
        for(int i = first; i <= last; i++){
            count =0;
            for(int j = 2; j <= i/2; j++){
                if(i%j==0){
                    count++;
                    break;
                }
            }
            if(count==0){
                System.out.println(i+" ");
            }
        }
    }
}
