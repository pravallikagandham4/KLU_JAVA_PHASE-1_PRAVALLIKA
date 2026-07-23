import java.util.*;
class Codechef{
    void dis(int a,float b){
        System.out.println(a+b);
    }
    void dis(int b,char c){
        System.out.println(b+" "+c);
    }
}
public class DifferentPackage {

    public static void main(String[] args) {
        int a;
        float b;
        char c;
        Scanner sc = new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextFloat();
        c=sc.next().charAt(0);
        Codechef obj = new Codechef();
        obj.dis(a,b);
        obj.dis(a,c);
        obj.dis(a,b);





    }
}
