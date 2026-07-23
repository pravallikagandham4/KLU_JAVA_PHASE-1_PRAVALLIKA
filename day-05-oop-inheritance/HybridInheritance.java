import java.util.*;
public class HybridInheritance {
    static class GrandFather{
        void gen1() {
            System.out.println("Diamond");
        }
    }
    static class Father extends GrandFather{
        void gen2() {
            System.out.println("Gold");
        }
    }
    static class Mother extends Father{
        void gen2() {
            System.out.println("Copper");
        }
    }
    static class Son extends Father{
        void gen3() {
            System.out.println("Cash");
        }
    }
    public static void main(String[] args) {
        Son s= new Son();
        s.gen3();
        s.gen2();
        s.gen1();
        Mother m = new Mother();
        m.gen2();
        m.gen1();
    }
}
