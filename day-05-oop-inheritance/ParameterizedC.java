import java.util.*;

public class ParameterizedC {
    static class Student {
        int roll;
        String name;

        Student(int roll, String name) {
            this.roll = roll;
            this.name = name;
        }

        void display() {
            System.out.println(roll + " " + name);
        }
    }

    public static void main(String[] args) {
        Student s1 = new Student(12, "ABC");
        Student s2 = new Student(13, "xyz");
        s1.display();
        s2.display();
    }
}
