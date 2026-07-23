public class MultiLevelIneritance {
    static class GrandFather {
        void gen1(){
            System.out.println("Diamond");
        }
    }
    static class Father extends GrandFather {
        void gen2(){
            System.out.println("Gold");
        }
    }
    static class Son extends Father {
        void gen3(){
            System.out.println("Cash");
        }
    }
    public static void main(String[] args) {
        Son son = new Son();
        son.gen1();
        son.gen2();
        son.gen3();
        Father father = new Father();
        father.gen1();
        father.gen2();
        GrandFather grandFather = new GrandFather();
        grandFather.gen1();
    }
}
