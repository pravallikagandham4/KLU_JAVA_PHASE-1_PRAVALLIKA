import java.util.*;
public class SingleInheritance {
    static class Father {
        void gen1(){
            System.out.println("Gold");
        }
    }
    static class Son extends Father {
        void gen2(){
            System.out.println("Cash");
        }
    }
    public static void main(String[] args) {
        Son s = new Son();
        s.gen1();
        s.gen2();
        Father f = new Father();
        f.gen1();
    }
}
