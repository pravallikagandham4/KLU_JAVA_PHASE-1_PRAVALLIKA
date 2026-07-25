import java.util.*;
class Grandfather{
    void gen1(){
        System.out.println("Diamond");
    }
}
class Father extends Grandfather{
    void gen2(){
        System.out.println("Gold");
    }
}
class Son extends Father{
    void gen3(){
        System.out.println("Cash");
    }
}
class Main{
    public static void main(String[] args){
        Son s = new Son();
        s.gen3();
        s.gen2();
        s.gen1();
        Father f = new Father();
        f.gen2();
        f.gen1();
        Grandfather g = new Grandfather();
        g.gen1();
    }
}