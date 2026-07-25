import java.util.*;
public class Main {
    void add(int a,int b) {
        System.out.println("Addition of 2 datas:"+(a+b));
    }
    void add(int a,int b,int c) {
        System.out.println("Addition of 3 datas:"+(a+b+c));
    }
    public static void main(String[] args) {
        int a,b,c;
        Scanner obj = new Scanner(System.in);
        a=obj.nextInt();
        b=obj.nextInt();
        c=obj.nextInt();
        Main m = new Main();
        m.add(a,b);
        m.add(a,b,c);
    }
}