//RunTime Polymorphism
 public class Shape {
    void area(){
        System.out.println("DISPLAY DIFFERENT SHAPES FORMULA");
    }
}
class Rectangle extends Shape {
    void area(){
        System.out.println("l*b");
    }
}
class Circle extends Shape {
    void area(){
        System.out.println("2*pi*r*r");
    }
}
class Main{
    public static void main(String[] args) {
        Shape obj = new Rectangle();
        Shape obj2 = new Circle();
        obj.area();
        obj2.area();
    }
}