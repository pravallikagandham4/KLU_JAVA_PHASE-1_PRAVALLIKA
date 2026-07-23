import com.sun.tools.javac.Main;

import java.util.*;
public class Constructor {
    int a;
    String b;
    Constructor() {
        System.out.println(a);
        System.out.println(b);
    }
    public static void main(String[] args) {
        Constructor obj = new Constructor();
    }
}
