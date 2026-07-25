import java.util.*;
class Father {
    void gen2(){
        System.out.println("Gold");
    }
}

class Son extends Father{
    void gen31(){
        System.out.println("Cash");
    }
}
class Daughter extends Father{
    void gen32(){
        System.out.println("Platinum");
    }
}
class Main{
    public static void main(String[] args){
        Son s = new Son();
        s.gen31();
        s.gen2();
        Daughter d = new Daughter();
        d.gen32();
        d.gen2();
        Father f = new Father();
        f.gen2();
    }
}