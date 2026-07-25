import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
    void display(int a) {
        System.out.println("Integer data: " + a);
    }
    void display(float b) {
        System.out.println("Float data: " + b);
    }
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
         Main c = new Main();
            int a = obj.nextInt();
            float b = obj.nextFloat();
            c.display(a);
            c.display(b);
        
    }
}