import java.util.*;
public class PrimeCount {
    public static void main(Strong[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int c=0;
        while(n>0){
            int d = n%10;
            if(d==1||d==2||d==3||d==5||d==7||d==9){
                c++;
            }
            n=n/10;
        }
        System.out.println(c+" prime count");
    }
}
