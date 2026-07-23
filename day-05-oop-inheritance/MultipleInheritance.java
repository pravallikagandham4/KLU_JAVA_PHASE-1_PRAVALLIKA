import java.util.*;
public class MultipleInheritance {
    static class Father {
         void gen2() {
            System.out.println("Gold");
        }
    }
    static class Son extends Father {
        void gen31() {
            System.out.println("Cash");
        }
    }
    static class Daughter extends Father {
        void gen32() {
            System.out.println("Platinum");
        }
    }
    public static void main(String[] args) {
        Son son = new Son();
        son.gen31();
        son.gen2();
        Daughter daughter = new Daughter();
        daughter.gen32();
        daughter.gen2();
        Father father = new Father();
        father.gen2();
    }
}
