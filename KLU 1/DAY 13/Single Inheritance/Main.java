import java.util.*;
class Father{
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
        Father f = new Father();
        f.gen2();
    }
}